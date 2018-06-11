package level01_04;

public class Cat {
	private String name;
	private String color;
	private int age;
	public Cat() {
		super();
	}
	public Cat(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void catchMouse() {
		System.out.println(this.age+"岁的"+this.color+this.name+"，在抓老鼠");
	}
}
