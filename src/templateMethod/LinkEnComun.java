package templateMethod;

public class LinkEnComun extends Filtro {

	@Override
	protected boolean cumple(WikipediaPage page, WikipediaPage page2) {
		return page.getLinks().stream().anyMatch(p -> page2.getLinks().contains(p));
	}

}
