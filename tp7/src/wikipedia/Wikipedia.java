package wikipedia;

import java.util.List;
import java.util.Map;

public class Wikipedia implements Wikipediapage{
	
	private String title;
	private List<Wikipediapage> links;
	private Map<String, Wikipediapage> infobox;
	
	

	public Wikipedia(String title, List<Wikipediapage> links, Map<String, Wikipediapage> infobox) {
		super();
		this.title = title;
		this.links = links;
		this.infobox = infobox;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	@Override
	public List<Wikipediapage> getLink() {
		// TODO Auto-generated method stub
		return links;
	}

	@Override
	public Map<String, Wikipediapage> getInfoBox() {
		// TODO Auto-generated method stub
		return infobox;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setLinks(List<Wikipediapage> links) {
		this.links = links;
	}

	public void setInfobox(Map<String, Wikipediapage> infobox) {
		this.infobox = infobox;
	}
	
	public void agregarLink(Wikipediapage page) {
		links.add(page);
	}
	
	
	
	

}
