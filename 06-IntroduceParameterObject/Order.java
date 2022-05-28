package xxx.refactorings.parameterobject;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;


public class Order {
	private Hashtable<String, Float> items = new Hashtable<String, Float>();

	public void addItem(OrderItem oi) {
		items.put(oi.getProductID() + ": " + oi.getDescription(), (oi.getQuantity() * oi.getPrice()) - (oi.getQuantity() * oi.getPrice() * oi.getDiscount()));
	}

	public float calculateTotal() {
		float total = 0;
		Enumeration<String> keys = items.keys();

		while (keys.hasMoreElements()) {
			total = total + items.get(keys.nextElement());
		}
		return total;
	}
}
