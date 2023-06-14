package test_book2;

public class Major extends Book{
	
	String subject;

	@Override
	void printbook() {
		// TODO Auto-generated method stub
		super.printbook();
		
		System.out.println("정공분야는 "+subject+"입니다.");
	}
	
	
	

}
