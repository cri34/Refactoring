package refactoritzacions;


public class Vehicle {
	private int horsePower;
	private String type;

	public Vehicle(int power) {
		setHorsePower(power);
		setType();
	}

	private void setType() {
		if (horsePower >= 10) {
			type = "Truck";
		} else if (horsePower > 5 && horsePower < 10) {
			type = "Car";
		} else {
			type = "Bike";
		}
	}
	public int setHorsePower(int power){
		this.horsePower=horsePower;
		}
	public int getHorsePower() {
		return horsePower;
	}

	public String getType() {
		return type;
	}
}
