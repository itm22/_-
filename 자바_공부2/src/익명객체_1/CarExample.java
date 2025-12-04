package 익명객체_1;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		
		car.run1();
		
		car.run2();
		
		car.run3(new Tire() {
			public void roll() {
				System.out.println("익명 자식 Tire 객체3이 굴러갑니다.");
			}
		});
	}

}
