package practice12_abstraction_polymorphism;

public class Q3 {
	
	public static void main(String[] args) {
        PercentageCoupon coupon1 = new PercentageCoupon(0.3);
        FixedCoupon coupon2 = new FixedCoupon(1000);
        System.out.println(Casher.payment(5000, coupon1));
        System.out.println(Casher.payment(5000, coupon2));

        //①変数coupon3を宣言します。5割引のクーポンを生成し代入します。
        PercentageCoupon coupon3 = new PercentageCoupon(0.5);
        //②変数coupon4を宣言します。1500円引のクーポンを生成し代入します。
        FixedCoupon coupon4 = new FixedCoupon(1500);
        //③Casherのpaymentメソッドを呼び出し、5000円に対してcoupon3を適用した結果を表示します。
        System.out.println(Casher.payment(5000, coupon3));
        //④Casherのpaymentメソッドを呼び出し、5000円に対してcoupon4を適用した結果を表示します。
        System.out.println(Casher.payment(5000, coupon4));
    }  

}
