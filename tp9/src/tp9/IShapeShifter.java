package tp9;

import java.util.List;

public interface IShapeShifter {
	
	
	public IShapeShifter compose(IShapeShifter ishapeShifter);
	
	public int deepest();
	
	public IShapeShifter flat();
	
	public List<Integer> values();
	
}
