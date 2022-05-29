package xxx.refactorings.splittemporaryvariable;


public class Invoice {
	public float totalPrice (float price, float vat, float discount) {
		float temp = 0;
		float apliedVat=(vat * price) / 100;
		float priceWithVat=apliedVat + price;
		System.out.println("Applied vat: " + apliedVat);
		System.out.println("Total with vat: " + priceWithVat);
		return priceWithVat - discount;
	}
}
