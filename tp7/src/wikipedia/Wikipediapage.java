package wikipedia;

import java.util.List;
import java.util.Map;

public interface Wikipediapage {

	public String getTitle();
	
	public List<Wikipediapage> getLink();
	
	public Map<String, Wikipediapage> getInfoBox();
}
