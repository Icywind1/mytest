package level02_03;

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
	public void reading(Book book) {
		System.out.println(name+"正在看"+book.getName()+"小说");
	}
	
}
