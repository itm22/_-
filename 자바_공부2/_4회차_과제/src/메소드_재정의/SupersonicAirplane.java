package 메소드_재정의;

public class SupersonicAirplane extends Airplane {
	
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	public void fly() {
		if(flyMode == NORMAL) {
			super.fly();
		}
		
		else {
			System.out.println("초음속비행합니다.");
		}
	}
}
