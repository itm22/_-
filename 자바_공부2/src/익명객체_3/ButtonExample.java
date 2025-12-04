package 익명객체_3;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Button btnOk = new Button();
		
		btnOk.setClickListener(new Button.ClickListener() {
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");
			}
 		});

		btnOk.click();
		
		Button btnCancel = new Button();
		
		btnCancel.setClickListener(new Button.ClickListener(){
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		});
		
		btnCancel.click();
	}

}
