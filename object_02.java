class BaseballPlayer2
{
	int age, height, weight;
	
	/*������*/
	BaseballPlayer2()
	{
		age=0;
		height=0;
		weight=0;
		System.out.println("�߱����� Ŭ������ ������");
	}
	
	public void eat() {
		System.out.println("�Դ´�.");
	}
	public void sleep() {
		System.out.println("�ܴ�.");
	}
	public void run() {
		System.out.println("�޸���.");
	}
}
public class object_02 {

	public static void main(String[] args) {
		BaseballPlayer2 kim=new BaseballPlayer2();
	}
}
