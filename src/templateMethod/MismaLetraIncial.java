package templateMethod;

import java.util.List;

public class MismaLetraIncial extends Filtro {

	@Override
	protected boolean cumple(WikipediaPage page, WikipediaPage page2) {
		return page.getTitle().charAt(0) == page2.getTitle().charAt(0);
	}

}
