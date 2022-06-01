package refactoritzacions;

public class PasswordChecker {
	public static String improvePassword (String password) {
		int minPasswordLenght=5;
		if (password.length() < minPasswordLenght) {
			return makeValidPassword(password);
		}
			return password;
	}
	private String makeValidPassword(String password){
		return "****" + password + "****";

	}
}
