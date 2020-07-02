package shape;

import java.util.ArrayList;
import java.util.List;


public class ShapeShifterUnico implements IShapeShifter{
	
	// esta es una hoja 
	private Integer valor;


	
	public ShapeShifterUnico(Integer valor) {
		super();
		this.valor = valor;
		
	}

	public Integer getValor() {
		return this.valor;
	}
			
	
	
	@Override
	public IShapeShifter compose(IShapeShifter esShapeShifter) {
		ShapeShifterMultiple shape = new ShapeShifterMultiple();
		shape.agregarShape(this);
		shape.agregarShape(esShapeShifter);
		
		return shape;
	}

	@Override
	public int deepest() {
		return 0;
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
