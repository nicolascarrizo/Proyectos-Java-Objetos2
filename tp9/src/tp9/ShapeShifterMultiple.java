package tp9;

import java.util.ArrayList;
import java.util.List;


public class ShapeShifterMultiple extends ShapeShifter{
	
	private Integer valor;
	private Integer profundidad;
	private List<IShapeShifter> listShapeShifters;

	
	public ShapeShifterMultiple(IShapeShifter shapeShifterA, IShapeShifter shapeShifterB) {
		this.profundidad = shapeShifterA.deepest() + shapeShifterB.deepest();
		listShapeShifters = new ArrayList<IShapeShifter>();
		listShapeShifters.add(shapeShifterA);
		listShapeShifters.add(shapeShifterB);
	}
	
	

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Integer getProfundidad() {
		return profundidad;
	}


	@Override
	public IShapeShifter compose(IShapeShifter eShapeShifter) {
		
		IShapeShifter multiple = new ShapeShifterMultiple(this, eShapeShifter);
		return multiple;

	}

	@Override
	public int deepest() {
		Integer resultado = 0;
		for (IShapeShifter eShapeShifter : listShapeShifters) {
			if (eShapeShifter.deepest() > resultado) {
				resultado = eShapeShifter.deepest();
			}
		}
		return resultado;
	}

	@Override
	public IShapeShifter flat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> values(){
		return null;
		 /*List<Integer> valores = new List<Integer>();
		 
		 for(IShapeShifter esShapeShifter : listShapeShifters) {
			 
			 valores.add(esShapeShifter.get)*/
		 }
		
		
}

