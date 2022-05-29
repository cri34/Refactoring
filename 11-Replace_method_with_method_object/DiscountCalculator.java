public class DiscountCalculator{
private double price;
private double discount;
private Customer customer;

public DiscountCalculator(double price, double discount,Customer customer){
this.price=price;
this.discount=discount;
this.customer=customer;
}
private double calculateVat() {
		 double appliedVat;

		if ( customer.isVip()) {
            appliedVat = 1.04f;
		} else if (customer.isSpecial()) {
            appliedVat = 1.15f;
		} else {
            appliedVat = 1.21f;
		}

		return  appliedVat;
	}
private double calculatePrice(double price){
double finalPrice;
if (price > 50 && customer.isVip()) {
			finalPrice = price * 0.5;
		} else if (price > 10 && customer.isSpecial()) {
			finalPrice = price * 0.1;
		} else {
			finalPrice = price;
		}
        return finalPrice;
}
public double aplyDiscount (double discount){
    return calculatePrice() * calculateVat() - discount;

}

}