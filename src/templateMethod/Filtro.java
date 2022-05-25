package templateMethod;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Filtro {
	
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		return wikipedia.stream().filter(p -> this.cumple(p, page)).collect(Collectors.toList());
	}

	protected abstract boolean cumple(WikipediaPage page, WikipediaPage page2);
}
