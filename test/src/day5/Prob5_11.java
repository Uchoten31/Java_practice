
package day5;

public class Prob5_11 {

	public static void main(String[] args) {
		
		String all = "";
		String a = "";	// 0以上60未満の数値
		String b = "";	// 60以上80未満の数値
		String c = "";	// 80以上の数値
		int i;
		int data[] = new int[5];
		
		for(i = 0; i < data.length; i++) {
			int num = (int)(Math.random()*100)+1;
			data[i] = num;
			all += num + " ";
			if(num >=0 && num < 60) {
				a += num + " ";
			} else if(num >= 60 && num < 80) {
				b += num + " ";
			} else {
				c += num + " ";
			}
		}
		System.out.println(all);
		System.out.println();
		System.out.println("0以上60未満：" + a);
		System.out.println("60以上80未満：" + b);
		System.out.println("80以上：" + c);
	}
}
