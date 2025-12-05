package protected_접근_제한자_;

public class C {

	public void method(){
		A a = new A();
		a.field = "value";
		a.method();
	}
}
