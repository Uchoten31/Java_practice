package practice12_abstraction_polymorphism;

public class Casher {
	
	static int payment(int amount, Coupon coupon) {
		return coupon.discount(amount);
	}

}
