package cicleExam;

public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle();
		c1.setRadius(5.0);
		System.out.println("반지름:"+c1.getRadius());
		System.out.println("원의 면적:"+c1.computeArea());
		System.out.println("원의 둘레:"+c1.computePerimeter());
		
		Circle c2=new Circle(8.0);
		System.out.println("반지름:"+c2.getRadius());
		System.out.println("원의 면적:"+c2.computeArea());
		System.out.println("원의 둘레:"+c2.computePerimeter());

	}

}
