package practice12_abstraction_polymorphism;

public class PercentageCoupon implements Coupon{
	
	double rate;
	
	//	コンストラクタ
	public PercentageCoupon(double rate){
		this.rate = rate;
	}
	
	//	discountメソッドの実装
	public int discount(int amount) {
		return amount - (int)(amount * rate);
	}
	
	
}
