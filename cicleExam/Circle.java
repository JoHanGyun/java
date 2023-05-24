package cicleExam;

public class Circle {

	private double radius;
	private final static double PI=3.14;
	
	//기본생성자
	public Circle(){
		
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	//원의 면적구하기
	public double computeArea() {
		return radius*radius*PI;
	}
	//원의 둘레 구하기
	public double computePerimeter() {
		return radius*2*PI;
	}
	
	
}