package level02_04;

public class PersonTest {
	public static void main(String[] args) {
		//new Person("小王").sellPhone(new Phone("IPhone",6000));
		
		
		//使用带参构造创建 Person 对象 p,name 初始化为小王
		Person p = new Person("小王");
		//调用对象 p 的 sellPhone()方法,赋值给 Phone phone 变量
		Phone phone = p.sellPhone();
		
		System.out.println(p.getName()+"卖出一部价值"+phone.getPrice()+"的"+phone.getBrand()+"手机");
	}
}
