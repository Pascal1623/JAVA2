
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
/*�ּҰ����� 1�� ����, �ٽ� 1�� ���ϸ� ��� �ɱ�? �� ���� �翬�� -127��
���´�. ó�� ���� �е��� �� ������ ����� ���� ������, ���ذ� �� �Ǹ� �ϴ���
�ܿ� ����.
�׷���, �̿� ���� byte���� �� ���������? �׳� int�� longŸ��ó�� ū ������
�ְ� ����϶�� �ϸ� ���� �ٵ� ���̴�.�����е��� �������� �����ϰ�, �̹�����
������ ��, ���� �����Ͱ� ��� int Ÿ���� ��츦 �����غ���. �׷���, �ܼ���
���� �ϳ��� ǥ���ϱ� ���ؼ� 32���� 0�� 1�� ǥ���ϱ� ���� ������ �ʿ��ϴ�. ��,
byte ������ �����ؼ� ����Ѵ�. �׷��� ���� ������ ���� ���� ������ ������ ��
�ִ�.*/
		