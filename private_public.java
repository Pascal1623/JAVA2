class BaseballPlayer4
{
	private String name=null;
	private int age, weight, height;
	
	BaseballPlayer4(String n)
	{
		name=n;
	}
	
	public void eat() {
		System.out.println(name+"가 먹는다");
	}
	
	public void run() {
		System.out.println(name+"가 달린다");
	}
}

public class private_public {

	public static void main(String[] args) {
		BaseballPlayer4 kim=new BaseballPlayer4("박찬호");
		kim.eat();
	}

}
