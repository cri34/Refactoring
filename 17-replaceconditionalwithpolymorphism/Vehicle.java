package XXX.refactorings.replaceconditionalwithpolymorphism;

public abstract class Vehicle {
	private int speed;
	private int acceleration;

	public Vehicle( int speed, int acceleration) {
		this.speed = speed;
		this.acceleration = acceleration;
	}
	
	public abstract int move ();
}
