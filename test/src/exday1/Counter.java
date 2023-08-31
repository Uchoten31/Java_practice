package exday1;

public class Counter {
	//	カウント
	private int count = 0;
	//	トータルのカウント回数を記録
	private static int totalCount = 0;
	//	コンストラクタ
	public void reset() {
		totalCount -= count;
		count = 0;
	}
	//	カウント
	public void count() {
		count++;
		totalCount++;
	}
	//	値の取得
	public int getCount() {
		return count;
	}
	//	2つのカウントの和を求める
	public static int getTotalCount() {
		return totalCount;
	}
}
