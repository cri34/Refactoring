package xxxx.refactorings.replacemethodwithmethodobject;

public class Customer {

	private boolean isVip;
	private boolean isSpecial;
	public Customer(boolean isVip, boolean isSpecial) {
		this.isVip = isVip;
		this.isSpecial = isSpecial;
	}
	public int getType() {
		return type;
	}

	public boolean isVip() {
		return isVip;
	}

	public boolean isSpecial() {
		return isSpecial;
	}
}
