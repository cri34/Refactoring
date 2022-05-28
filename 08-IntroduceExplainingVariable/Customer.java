package xxx.refactorings.explainingvariable;


class Customer {
	private String name;
	private int age;
	private float salary;
	
	public Customer(String name, int age, float salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


	public float applyDiscount (float totalAmount) {
		boolean ageValid=age > 17 && age < 66;
		boolean salaryValid=(salary - (salary * 0.2f)) < 1000f;
		boolean discountValid=totalAmount * 0.5 < 100;
		 if ( ageValid && salaryValid && discountValid ) {
			return totalAmount * 0.9f;
		 } else {
			return totalAmount;
		 }
		}

}
