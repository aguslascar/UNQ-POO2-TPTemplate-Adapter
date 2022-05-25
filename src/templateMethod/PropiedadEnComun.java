package templateMethod;

import java.util.Map;

public class PropiedadEnComun extends Filtro {

	@Override
	protected boolean cumple(WikipediaPage page, WikipediaPage page2) {
		return page.getInfoBox().keySet().stream().anyMatch(k -> page2.getInfoBox().containsKey(k));
	}

}
