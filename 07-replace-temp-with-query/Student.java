package xxx.refactorings.replacetempwithquery;


public class Student {
	private String name;
	private boolean hasGoodAttitude;

	public Student(String name, boolean hasGoodAttitude) {
		this.name = name;
		this.hasGoodAttitude = hasGoodAttitude;
	}

	public float calculateAverage(float homework, float exam) {
		float mark = (homework + exam) / 2;

		if (hasGoodAttitude) {
			return getMark(homework,exam)+ 1;
		} else {
			return getMark(homework,exam);
		}
	}
	private getMark(float homework, float exam){
		return (homework + exam) / 2;

	}
}
