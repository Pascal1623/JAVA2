class BaseballPlayer2
{
	int age, height, weight;
	
	/*생성자*/
	BaseballPlayer2()
	{
		age=0;
		height=0;
		weight=0;
		System.out.println("야구선수 클래스의 생성자");
	}
	
	public void eat() {
		System.out.println("먹는다.");
	}
	public void sleep() {
		System.out.println("잔다.");
	}
	public void run() {
		System.out.println("달린다.");
	}
}
public class object_02 {

	public static void main(String[] args) {
		BaseballPlayer2 kim=new BaseballPlayer2();
	}
}
