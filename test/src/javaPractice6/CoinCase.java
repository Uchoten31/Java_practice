package javaPractice6;

public class CoinCase {

	private int yen500 = 0;
	private int yen100 = 0;
	private int yen50 = 0;
	private int yen10 = 0;
	private int yen5 = 0;
	private int yen1 = 0;
	
	
	public void AddCoins(int kind, int count) {
		
		switch(kind) {
		case 500:
			yen500 += count;
			break;
		case 100:
			yen100 += count;
			break;
		case 50:
			yen50 += count;
			break;
		case 10:
			yen10 += count;
			break;
		case 5:
			yen5 += count;
			break;
		case 1:
			yen1 += count;
			break;
		}
	}
		
	
	public int GetCount(int kind) {
		
		switch(kind) {
		case 500:
			return yen500;
		case 100:
			return yen100;
		case 50:
			return yen50;
		case 10:
			return yen10;
		case 5:
			return yen5;
		case 1:
			return yen1;
//			break;        ←このbreak;はなぜいらない？
		}
		return 0;
	}
	
	public int GetAmount() {
		return (yen500 * 500) + (yen100 * 100) +
				(yen50 * 50) + (yen10 * 10) +
				(yen5 * 5) + (yen1 * 1);
	}
	
	
	
	
}
