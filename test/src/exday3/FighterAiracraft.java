package exday3;

public class FighterAiracraft extends AirPlane {

	//	コンストラクタ
	public FighterAiracraft(String type) {
		super(type);
	}
		
    //  飛行する
    public void fly(){
        System.out.println("攻撃に出るために飛行します。");
    }
    //  戦闘する
    public void target(){
        System.out.println("戦闘します。");
    }
	
}
