package refactoritzacions;

import java.util.Date;


public class Customer {
	/*-r*/
	private String name;
	private String dni;
	private CreditCard creditCard;
	
	public Customer(String name, String dni, CreditCard creditCard) {
		this.creditCard = creditCard;
		this.name = name;
		this.dni = dni;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(CreditCard creditCard){
		this.creditCard=creditCard;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
}
