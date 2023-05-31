package unit02.car;

public class Car {
	
	String carname;
	String color="black";
	int velocity;
	
	void speedUp() {
		velocity += 5;
	}
	
	void speedDown() {
		velocity-=5;
	}

}
