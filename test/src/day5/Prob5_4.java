package day5;

public class Prob5_4 {

	public static void main(String[] args) {
		String all = "";
		String more50 = "";
		String less50 = "";
		int data[] = new int[10];
		int i;
		
		for(i = 0; i < data.length; i++) {
			int num = (int)(Math.random()*100)+1;
			data[i] = num;
			all += num + " ";
			if(num >= 50) {
				more50 += num + " ";
			} else {
				less50 += num + " ";
			}
		}
		System.out.println(all);
		System.out.println();
		System.out.println("50以上の数：" + more50);
		System.out.println("50未満の数：" + less50);
	}
}
