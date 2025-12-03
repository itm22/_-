package 사용자_정의_예외;

public class InsufficientException extends Exception {
	public InsufficientException() {
	}
	
	public InsufficientException(String message) {
		super(message);
	}
}
