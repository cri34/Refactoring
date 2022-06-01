package refactoritzacions;


public class Main {
	private ConversorEur_Pound conversor = new ConversorEur_Pound();
	
	public double convert (double amount) {
		return ConversorEur_Pound.euro2Pound(amount);
	}
}
