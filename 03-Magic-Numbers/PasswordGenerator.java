package xx.refactorings.magicnumbers;

import java.util.Random;


public class PasswordGenerator {
	private Random random = new Random();
	private String characters = "abcdefghijkmnopqrstuvwxyz23456789";

	public String generatePassword(int length) throws Exception {
		int minPass=6;
		int maxPass=15;
		if (length < minPass || length > maxPass) {
			throw new Exception("Wrong password length: " + length);
		} else {
			String password = "";

			for (int i = 0; i < length; i++)
				password += characters.charAt(random.nextInt(characters.length()));

			return password;
		}
	}
}
