package level02_02;

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
	public void sing(String song) {
		System.out.println(this.name+"ÕıÔÚÑİ³ª"+song+"¸èÇú");
	}
	
}
