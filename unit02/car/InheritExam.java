package unit02.car;

public class InheritExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi myTaxi=new Taxi();
		myTaxi.carname="Ƽ��";
		myTaxi.color="red";
		myTaxi.speedDown();
		myTaxi.speedUp();
		
		System.out.println(myTaxi.color);
		System.out.println(myTaxi.carname+"�� �ӵ���"+myTaxi.velocity);
		
		Truck myTruck=new Truck();
		myTruck.carname="����";
		myTruck.color="white";
		myTruck.speedUp();
		myTruck.speedDown();
		System.out.println(myTruck.color);
		System.out.println(myTruck.carname+"�� �ӵ���"+myTruck.velocity);

	}

}
