package test_book2;

public class Cartoon extends Book{

	boolean webtoon;

	@Override
	void printbook() {
		// TODO Auto-generated method stub
		super.printbook();
		
		if(webtoon==true)
			System.out.println("�� ��ȭ�� �����Դϴ�.");
		else
			System.out.println("�� ��ȭ�� ������ �ƴմϴ�.");
	}
	
}
