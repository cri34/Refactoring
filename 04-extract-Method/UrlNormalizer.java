package xxx.refactorings.extractmethod;


public class UrlNormalizer {

	public String normalize(String title) {
		String url = "";
		// First we trim whitespaces
		url = title.trim();
		// Remove special chars
		url = removeSpecialChars();

		// Replace white spaces with hyphens
		
		url = remplazeWhiteSpaces();

		// lowercase everything
		url = url.toLowerCase();

		return url;
	}
	private String removeSpecialChars (){
		String specialRemoved = "";
		for (int i = 0; i < url.length(); i++) {
			if (url.charAt(i) != ',' && url.charAt(i) != ':' 
					&& url.charAt(i) != '.' && url.charAt(i) != '?') {
				specialRemoved += url.charAt(i);
			}
		}
		return specialRemoved;
	}
	
	private String remplazeWhiteSpaces(){
String spacesReplaced = "";
		for (int i = 0; i < url.length(); i++) {
			if (url.charAt(i) == ' ') {
				spacesReplaced += "-";
			} else {
				spacesReplaced += url.charAt(i);
			}
		}
		return spacesReplaced;
	}
}

