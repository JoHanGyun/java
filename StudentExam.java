package student0405;

public class StudentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		Student park = new Student();
		
		kim.name = "±è±æµ¿";
		kim.grade = 2;
		kim.ban = 5;
		kim.number = 4;
		kim.eat();
		kim.run();
		
		kim.setTelephone("01083908233");
		System.out.println(kim.getTelephone());
		
		park.name = "¹Ú·Îº¿";
		park.grade = 2;
		park.ban = 5;
		park.number = 4;
		park.eat();
		park.run();
		
		
			

	}

}
