package 예외_떠넘기기;

public class ThrowsEaxmple2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		findClass();
	}

	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}
