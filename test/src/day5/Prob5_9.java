
package day5;

public class Prob5_9 {

	public static void main(String[] args) {
		
		String all = "";
		String big50 = "";
		String small50 = "";
		int i;
		int data[] = new int[10];
		
		for(i = 0; i < data.length; i++) {
			int num = (int)(Math.random()*101);
			data[i] = num;
			all += num + " ";
			if(num >= 50) {
				big50 += num + " ";
			} else {
				small50 += num + " ";
			}
		}
		System.out.println(all);
		System.out.println();
		System.out.println("50以上の数：" + big50);
		System.out.println("50未満の数：" + small50);
	}
}
