package level02_01;

public class Test {
	public static void main(String[] args) {
		//�����ֻ�����
		Phone p = new Phone("IPhone");
		//�����˶���
		Person person = new Person("����",18);
		
		//����person����
		person.usePhone(p);
		
	}
}
