/*�Լ��� �̿��� ����

���α׷��� �ۼ��ϴ� ���� �ε����ϰ� Ŭ���� ���ο� �����ؼ� ������ ���� �����ϰų�
������ ���� ���� �� �ֽ��ϴ�. ���� ���, ���̸� �˰� �ʹٵ��� ������ ������ 30��
������ �־�� �Ѵٵ��� ���� �� �״�� ������ �Ͼ �� �ֽ��ϴ�. �̷� ���� Ŭ����
���� �̿� ���� ���� ����ϴ� �Լ��� ���� ���������� private�� ����Ǿ� �ִ�
������ ������ �����ϰų� �����ϸ� �˴ϴ�.*/
class BaseballPlayer3
{
	private String name=null;
	private int age, weight, height;
	
	BaseballPlayer3(String n)
	{
		name=n;
	}
	
	public void eat() {
		System.out.println(name+"�� �Դ´�.");
	}
	
	public void run() {
		System.out.println(name+"�� �޸���.");
	}
	
	/*private�� ����� age ������ ���� ����*/
	public void setAge(int aa) {
		age=aa;
	}
	
	/*private�� ����� age ������ ���� ����*/
	public int getAge() {
		return age;
	}
}

public class private_public_02 {

	public static void main(String[] args) {
		BaseballPlayer3 park=new BaseballPlayer3("����ȣ");
		park.setAge(30);
		System.out.println("����ȣ�� ���̴� "+park.getAge()+"�Դϴ�.");
	}
}
