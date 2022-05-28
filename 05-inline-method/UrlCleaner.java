package xxx.refactorings.inlinemethod;


public class UrlCleaner {

	public String clean(String title) {
		String url = url.trim();

		url = url.replaceAll("[\\.\\:\\,\\?\\!\\_\\;]", "");
		url = url.replaceAll("[\\s]+", " ").replaceAll("[\\s]", "-");
		url = url.toLowerCase();

		return url;
	}
}

