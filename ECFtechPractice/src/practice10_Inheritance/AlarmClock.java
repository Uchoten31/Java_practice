package practice10_Inheritance;

public class AlarmClock extends Clock{
	
	//	メンバ変数
	String alarmTime;
	
	
	//	コンストラクタ(親クラスのコンストラクタを呼び出す)
	public AlarmClock(String time) {
		super(time);
	}

	
	//	メソッド
	public void setAlarm(String time) {
		alarmTime = time;
	}
	
	
	public void alarm() {
		if(super.time.equals(alarmTime)) {
			System.out.println("アラームが鳴りました！");
		}
	}
	
	
}
