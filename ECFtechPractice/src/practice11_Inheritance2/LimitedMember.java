package practice11_Inheritance2;

public class LimitedMember extends Member{

	//	メンバ変数
	int startTime;
	int endTime;
	
	
	//	コンストラクタ
	public LimitedMember(String name, int startTime, int endTime) {
		super(name);
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	
	//	メソッド
	public int getMonthlyFee() {
		return (int)(super.getMonthlyFee() * 0.6);
	}
	
	public boolean isUsable(int hour) {
		if (startTime <= endTime) {
            if (startTime <= hour && hour <= endTime) {
                return true;
            }
            return false;
        } else {
            if( (startTime <= hour && hour <= 23) || 
                    (0 <= hour && hour <= endTime)) {
                return true;
            }
            return false;
        }
	}
	
	
}
