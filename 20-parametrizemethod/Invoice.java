package refactoritzacions;


public class Invoice {
	private float subtotal;
	private Customer customer;

	public Invoice(float subtotal, Customer customer) {
		this.subtotal = subtotal;
		this.customer = customer;
	}

	public float charge() {
		if (customer.getAge() < 18) {
			return realCharge(0.5f);
		} else if (customer.payInCash()) {
			return realCharge( 0.8f);
		} else {
			return realCharge();
		}
	}
	private float realCharge(float discount) {
		float total = subtotal * discount;
		return total;
	}

	private float realCharge() {
		return subtotal;
	}
}
