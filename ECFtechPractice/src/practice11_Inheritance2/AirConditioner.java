package practice11_Inheritance2;

public class AirConditioner extends Cooler{
	
	public AirConditioner(int nowTemp){
		super(nowTemp);
	}

	
	public void adjust() {
		if(nowTemp < goalTemp){
			nowTemp++;
			System.out.println("室温を1度上げました。");
		} else {
			super.adjust();
		}
		
	}
	
}
