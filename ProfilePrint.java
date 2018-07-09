/*-지역 변수local variable
중괄호 내에서 선언된 변수. 지역 변수를 선언한 중괄호 내에서만 유효하다.
-매개 변수parameters
메소드에 넘겨주는 변수. 메소드가 호출될 때 생명이 시작되고, 메소드가 끝나면 소멸된다.(정확히
이야기하면 좀 복잡하지만, 일단은 이렇게 기억해두자)
-인스턴스 변수instance variable
메소드 밖에, 클래스 안에 선언된 변수. 앞에는 static이라는 예약어가 없어야 한다.
객체가 생성될 때 생명이 시작되고, 그 객채를 참조하고 있는 다른 객체가 없으면
소멸된다.
-클래스 변수class variable
인스턴스 변수처럼 메소드 밖에, 클래스 안에 선언된 변수 중에서 타입 선언 앞에 static
이라는 예약어가 있는 변수클래스가 처음 호출될 때 생명이 시작되고, 그 객체를 참조하고
있는 다른 객체가 없으면 소멸된다.*/
public class ProfilePrint {

	public static void main(String[] args) {
		byte age;
		String name;
	}

}
