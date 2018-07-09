class BaseballPlayer1
{
	int age, weight, height;
	
	BaseballPlayer1()
	{
		System.out.println("인자가 없는 생성자");
	}
	
	BaseballPlayer1(int a, int h, int w)
	{
		age=a;
		height=h;
		weight=w;
		System.out.println("인자가 있는 생성자");
	}
	
	public void run() {
		System.out.println("달린다");
	}
	
	public void eat() {
		System.out.println("먹는다");
	}
	
	public void sleep() {
		System.out.println("잔다");
	}
}

public class object_03 {

	public static void main(String[] args) {
		BaseballPlayer1 kim=new BaseballPlayer1();
		BaseballPlayer1 min=new BaseballPlayer1(30, 180, 70);
	}

}
