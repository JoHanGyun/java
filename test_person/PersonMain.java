package test_person;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student();
		s1.name="������";
		s1.age=23;
		s1.online=true;
		
		s1.printInfo();
		
		SoccerPalyer s2=new SoccerPalyer();
		s2.name="���ڰ�";
		s2.age=28;
		s2.teamName="����FC";
		
		s2.printInfo();

	}

}