class BaseballPlayer4
{
	private String name=null;
	private int age, weight, height;
	
	BaseballPlayer4(String n)
	{
		name=n;
	}
	
	public void eat() {
		System.out.println(name+"�� �Դ´�");
	}
	
	public void run() {
		System.out.println(name+"�� �޸���");
	}
}

public class private_public {

	public static void main(String[] args) {
		BaseballPlayer4 kim=new BaseballPlayer4("����ȣ");
		kim.eat();
	}

}
