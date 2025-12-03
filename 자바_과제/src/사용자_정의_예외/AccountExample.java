package 사용자_정의_예외;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = new Account();
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		
		try {
			account.withdraw(30000);
		}
		catch(InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}

}
