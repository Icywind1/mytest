package level02_04;

public class Person {
	private String name;

	public Person() {
		super();
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Phone sellPhone() {
		return new Phone("IPhone",6000);
	}
	
}
