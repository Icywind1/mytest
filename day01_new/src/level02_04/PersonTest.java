package level02_04;

public class PersonTest {
	public static void main(String[] args) {
		//new Person("С��").sellPhone(new Phone("IPhone",6000));
		
		
		//ʹ�ô��ι��촴�� Person ���� p,name ��ʼ��ΪС��
		Person p = new Person("С��");
		//���ö��� p �� sellPhone()����,��ֵ�� Phone phone ����
		Phone phone = p.sellPhone();
		
		System.out.println(p.getName()+"����һ����ֵ"+phone.getPrice()+"��"+phone.getBrand()+"�ֻ�");
	}
}
