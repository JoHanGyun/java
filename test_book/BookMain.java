package test_book;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Book.getLibrary()+"�� ���� ������ "+Book.getBookCnt()+"�� �Դϴ�.");
		
		System.out.println("***************************************");
		
		Book b1=new Book();//�⺻�����ڷ� ����, ��� ������ ���� �ʱ�ȭ�������
		b1.setNo(101);
		b1.setName("������");
		b1.setCount(10);
		b1.setBorrow(0);
		
		Book b2=new Book (102,"���ڼ�����");//2�� ������ Ȱ��
		b2.setCount(5);
		b2.setBorrow(0);
		
		Book b3=new Book(103,"��������",15,0);//3�� ������ Ȱ��
		
		b1.printInfo();
		b2.printInfo();
		b3.printInfo();
		
		System.out.println("***************************************");
		
		
		System.out.println(Book.getLibrary()+"�� ���� ������ "+Book.getBookCnt()+"�� �Դϴ�.");
				
		System.out.println("***************************************");
		
		b1.borrowBook(15);
		b2.returnBook(2);
		b1.borrowBook(5);
		b3.returnBook(10);
		b3.returnBook(5);
		
		System.out.println("***************************************");
		
		b1.printInfo();
		b2.printInfo();
		b3.printInfo();

	}

}
