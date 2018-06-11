package level02_01;

public class Test {
	public static void main(String[] args) {
		//创建手机对象
		Phone p = new Phone("IPhone");
		//创建人对象
		Person person = new Person("景甜",18);
		
		//调用person方法
		person.usePhone(p);
		
	}
}
