class BaseballPlayer1
{
	int age, weight, height;
	
	BaseballPlayer1()
	{
		System.out.println("���ڰ� ���� ������");
	}
	
	BaseballPlayer1(int a, int h, int w)
	{
		age=a;
		height=h;
		weight=w;
		System.out.println("���ڰ� �ִ� ������");
	}
	
	public void run() {
		System.out.println("�޸���");
	}
	
	public void eat() {
		System.out.println("�Դ´�");
	}
	
	public void sleep() {
		System.out.println("�ܴ�");
	}
}

public class object_03 {

	public static void main(String[] args) {
		BaseballPlayer1 kim=new BaseballPlayer1();
		BaseballPlayer1 min=new BaseballPlayer1(30, 180, 70);
	}

}
