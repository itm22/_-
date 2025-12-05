package protected_접근_제한자;

public class B {
	
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}
