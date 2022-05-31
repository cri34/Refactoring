package xxx.refactorings.consolidateduplicateconditional;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Invoice {
	
	private Customer customer;
	private float price;
	private int qty;
	
	public Invoice (Customer customer, float price, int qty) {
		this.customer = customer;
		this.price = price;
		this.qty = qty;
	}
	
	public float calculateTotal (float vat, float discount) {
		float subtotal = 0;
		float discountCalculate=discount;
		if (customer.isVip()) {
			subtotal = (price * qty) - discount;
		} else {
			subtotal = (price * qty);
		}
		discountCalculate=(customer.isVip())?discount:0;

		subtotal = (price * qty) - discountCalculate;
		subtotal=subtotal * (1 + (vat/100))
		return subtotal;
	}
}
