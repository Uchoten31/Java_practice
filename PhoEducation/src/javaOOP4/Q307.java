package javaOOP4;

import java.util.Random;

public class Q307 {
	public static void main(String[] args) {
        // 平均的な性能のnormal号
        RacingCar normal = new RacingCar("Normal号", 10, 10);
        // スピードはあるがエンストが多いgambler号
        RacingCar gambler = new RacingCar("Gambler号", 20, 3);
        // 安全面を重視したcareful号
        RacingCar careful = new RacingCar("Careful号", 5, 1000);
        // 各車一斉にスタート！！
        normal.start();
        gambler.start();
        careful.start();
        // 前車がゴールするのを待つ
        try {
            normal.join();
            gambler.join();
            careful.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("レースが終了しました");
    }
}

// ここにRacingCarクラスを作成してください
class RacingCar extends Thread {
	
	public static final int GOAL = 100;  // ゴール地点までの距離
	
	private String name;	// 車の名前
	private int maxDistance;	// その車の最高走行距離
	private int engineStop;		// その車のエンストする割合
	
	// コンストラクタ
	public RacingCar(String name, int maxDistance, int engineStop) {
		this.name = name;
		this.maxDistance = maxDistance;
		this.engineStop = engineStop;
	}
	
	@Override
	public void run() {
		
		int totalMileage = 0;	// 総走行距離
		int mileage = 0;		// 一回の走行距離
		
		Random r = new Random();
		
		while(true) {
			
			try {
				// エンストするかどうか判定
				// エンストする場合
				if(r.nextInt(engineStop) == 0) {
					System.out.println(name + "がエンストしました！");
					// 3秒間停止
					Thread.sleep(3000);
				} 
				// エンストしなかった場合
				else {
					// 走行距離を取得
					mileage = r.nextInt(maxDistance) + 1;
					
					System.out.println(name + "が" + mileage + "km走行しました！");
					
					// 総走行距離に加算
					totalMileage += mileage;
					
					// GOALしていたらループを抜ける
					if(totalMileage >= GOAL) {
						break;
					}
					
					// 1秒停止してループが続く
					Thread.sleep(1000);	
					
				}
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + "がゴールしました！！！！！");
		
	}
}
