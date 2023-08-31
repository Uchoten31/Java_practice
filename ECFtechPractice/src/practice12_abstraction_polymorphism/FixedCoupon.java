package practice12_abstraction_polymorphism;

public class FixedCoupon implements Coupon{
	
	int discountAmount;
	
	//	コンストラクタ
	FixedCoupon(int discountAmount){
		this.discountAmount = discountAmount;
	}
	
//	discountメソッドの実装
	public int discount(int amount) {
		return amount - discountAmount;
	}
}
