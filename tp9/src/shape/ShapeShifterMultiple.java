package shape;

import java.util.ArrayList;
import java.util.List;


public class ShapeShifterMultiple implements IShapeShifter{
	
	//este es mi compuesto 
	private List<IShapeShifter> listShapeShifters;

	
	public ShapeShifterMultiple() {
		this.listShapeShifters = new ArrayList<IShapeShifter>();
		
	}
	

	@Override
	public IShapeShifter compose(IShapeShifter eShapeShifter) {
		ShapeShifterMultiple shape = new ShapeShifterMultiple();
		shape.agregarShape(eShapeShifter);
		shape.agregarShape(this);
		
		return shape;

	}

	@Override
	public int deepest() {
		Integer resultado = 1;
		for (IShapeShifter eShapeShifter : listShapeShifters) {
				resultado += eShapeShifter.deepest();
			
		}
		return resultado;
	}

	@Override
	public IShapeShifter flat() {
		ShapeShifterMultiple shape = new ShapeShifterMultiple();
		List<Integer> values = this.values();
		for(Integer value : values) {
			
			ShapeShifterUnico shapeUnico = new ShapeShifterUnico(value);
			shape.agregarShape(shapeUnico);
		}
	
		return shape;
	}

	@Override
	public List<Integer> values(){
		return null;
		
		/*ArrayList<Integer> values = new ArrayList<Integer>();
		
		for(IShapeShifter shape : listShapeShifters) {
			values.add
			}*/
	}



	public void agregarShape(IShapeShifter esShapeShifter) {
		listShapeShifters.add(esShapeShifter);
		
		
		
	}
		
		
}

