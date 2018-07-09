
public class PrimitiveTypes {

	public static void main(String[] args) {
		PrimitiveTypes type1=new PrimitiveTypes();
		PrimitiveTypes type2=new PrimitiveTypes();
		PrimitiveTypes type3=new PrimitiveTypes();
		PrimitiveTypes type4=new PrimitiveTypes();
		type1.checkByte();
		type2.checkOtherTypes();
		type3.checkchar();
		type4.checkBoolean();
	}

	public void checkByte() {
		byte byteMin=-128;
		byte byteMax=127;
		System.out.println("byteMin="+byteMin);
		System.out.println("byteMax="+byteMax);
		byteMin=(byte)(byteMin-1);
		byteMax=(byte)(byteMax+1);
		System.out.println("byteMin-1="+byteMin);
		System.out.println("byteMax+1="+byteMax);
	}
	
	public void checkOtherTypes() {
		short shortMax=32767;
		int intMax=2147483647;
		long longMax=9223372036854775807L;
		System.out.println("shortMax="+shortMax);
		System.out.println("intMax="+intMax);
		System.out.println("longMax="+longMax);
		shortMax=(short)(shortMax+1);
		intMax=(int)(intMax+1);
		longMax=(long)(longMax+1);
		System.out.println("shortMax+1="+shortMax);
		System.out.println("intMax+1="+intMax);
		System.out.println("longMax+1="+longMax);
	}
	
	public void checkchar() {
		char charMin='\u0000';
		char charMax='\uffff';
		System.out.println("charMin=["+charMin+"]");
		System.out.println("charMax=["+charMax+"]");
		int intValue='a';
		System.out.println("intValue=["+intValue+"]");
	}
	
	public void checkBoolean() {
		boolean flag=true;
		System.out.println(flag);
		flag=false;
		System.out.println(flag);
	}
	
	int intDefault1;
	public void defaultValues() {
		int intDefault2=0;
		System.out.println(intDefault1);
		System.out.println(intDefault2);
	}
}
/*최소값에서 1을 빼고, 다시 1을 더하면 어떻게 될까? 그 때는 당연히 -127이
나온다. 처음 보는 분들은 이 내용이 어려울 수도 있으나, 이해가 안 되면 일단은
외워 두자.
그런데, 이와 같은 byte형은 왜 만들었을까? 그냥 int나 long타입처럼 큰 공간을
주고 사용하라고 하면 편할 텐데 말이다.여러분들이 동영상을 저장하고, 이미지를
저장할 때, 저장 데이터가 모두 int 타입일 경우를 생각해보자. 그러면, 단순히
숫자 하나를 표현하기 위해서 32개의 0과 1을 표시하기 위한 공간이 필요하다. 즉,
byte 값들을 조합해서 사용한다. 그래야 적은 공간에 보다 많은 내용을 저장할 수
있다.*/
		