package practice11_Inheritance2;

public class Q3 {

	public static void main(String[] args) {

		Cooler cooler = new Cooler(28);
        AirConditioner aircon = new AirConditioner(28);

        //冷房の設定温度を27度にする
        cooler.setGoalTemp(27);
        //冷房が温度調節をする
        cooler.adjust();
        //冷房が温度調節をする
        cooler.adjust();

        //エアコンの設定温度を27度にする
        aircon.setGoalTemp(27);
        //エアコンが温度調節をする
        aircon.adjust();
        //エアコンの設定温度を28度にする
        aircon.setGoalTemp(28);
        //エアコンが温度調節をする
        aircon.adjust();
        //エアコンが温度調節をする
        aircon.adjust();
		
	}

}
