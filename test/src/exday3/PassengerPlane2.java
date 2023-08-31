package exday3;

public class PassengerPlane2 extends AirPlane{

	public PassengerPlane2(String type) {
		super(type);
	}
	
	public void fly() {
		System.out.println("乗客を乗せて目的地まで飛行します。");
	}
	
	public void target() {
		System.out.println("乗客を目的地まで運びます。");
	}
	
}
