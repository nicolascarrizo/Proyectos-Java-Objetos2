package shape;

import java.util.List;

public interface IShapeShifter {
	
	// este es mi componente 
	
	public IShapeShifter compose(IShapeShifter ishapeShifter);
	
	public int deepest();
	
	public IShapeShifter flat();
	
	public List<Integer> values();
	
}
