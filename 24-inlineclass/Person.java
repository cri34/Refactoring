package refactoritzacions;

import java.util.Date;


public class Person {
	private String name;
	private Date birth;
	private int sex;
	
	public Person(String name, Date birth, int sex) {
		this.name = name;
		this.birth = birth;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + "]";
	}
	
}
