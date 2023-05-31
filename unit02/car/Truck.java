package unit02.car;

public class Truck extends Car {
	int ton;
	
	void load() {
		ton+=10;
	}
	
	void unLoad() {
		ton-=10;
	}

}
