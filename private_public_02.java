/*함수를 이용한 접근

프로그램을 작성하다 보면 부득이하게 클래스 내부에 접근해서 변수의 값을 수정하거나
변경할 일이 생길 수 있습니다. 예를 들어, 나이를 알고 싶다든지 나이의 값으로 30을
적용해 주어야 한다든지 등의 말 그대로 변수가 일어날 수 있습니다. 이럴 때는 클래스
내에 이와 같은 일을 담담하는 함수를 만들어서 간접적으로 private로 선언되어 있는
변수의 값들을 수정하거나 변경하면 됩니다.*/
class BaseballPlayer3
{
	private String name=null;
	private int age, weight, height;
	
	BaseballPlayer3(String n)
	{
		name=n;
	}
	
	public void eat() {
		System.out.println(name+"가 먹는다.");
	}
	
	public void run() {
		System.out.println(name+"가 달린다.");
	}
	
	/*private로 선언된 age 변수에 값을 대입*/
	public void setAge(int aa) {
		age=aa;
	}
	
	/*private로 선언된 age 변수의 값을 리턴*/
	public int getAge() {
		return age;
	}
}

public class private_public_02 {

	public static void main(String[] args) {
		BaseballPlayer3 park=new BaseballPlayer3("박찬호");
		park.setAge(30);
		System.out.println("박찬호의 나이는 "+park.getAge()+"입니다.");
	}
}
