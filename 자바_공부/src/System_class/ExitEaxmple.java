package System_class;

public class ExitEaxmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 5) {
				System.out.println("프로세스 강제 종료");
				System.exit(0);
			}
		}
	}

}
