package tp9;

import java.util.ArrayList;
import java.util.List;


public class ShapeShifterUnico extends ShapeShifter{
	
	
	private Integer valor;
	private Integer profundidad;

	
	public ShapeShifterUnico(Integer valor, Integer profundidad) {
		super();
		this.valor = valor;
		this.profundidad = 0;
	}

	public Integer getValor() {
		return this.valor;
	}
			
	public Integer getProfundidad() {
		return profundidad;
	}
	
	public void setProfundidad(Integer profundidad) {
		this.profundidad = profundidad;
	}

	public void agrandarProfundidad(){
	 
		this.setProfundidad(this.getProfundidad() + 1);
	}
	

	@Override
	public IShapeShifter compose(IShapeShifter esShapeShifter) {
		this.agrandarProfundidad();
		ShapeShifterMultiple multiple = new ShapeShifterMultiple(this, esShapeShifter);
		return multiple;
	}

	@Override
	public int deepest() {
		return this.profundidad;
	}

	@Override
	public IShapeShifter flat() {
		return this;
	}

	@Override
	public List<Integer> values() {
		List<Integer> values = new ArrayList<Integer>();
		values.add(this.getValor());
		return values;
	}
	
}
