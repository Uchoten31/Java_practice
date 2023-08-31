package exday3;

public class ProbEx3_1 {

	public static void main(String[] args) {
        //  各クラスのインスタンスの生成
        AirPlane[] a = new AirPlane[2];
        a[0] = new FighterAiracraft("戦闘機");
        a[1] = new PassengerPlane2("旅客機");
        
        for(int i = 0; i < a.length; i++) {
        	a[i].fly();
        	a[i].target();
        }
 
    }

}
