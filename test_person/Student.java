package test_person;

public class Student extends Person{
	boolean online;

	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		
		if(online==true)
			System.out.println(name+"�� �л��̸� ���� �¶��� ���� ���Դϴ�.");
		else
			System.out.println(name+"�� �л��̸� ���� � ���� ���Դϴ�.");
	}
	

}
