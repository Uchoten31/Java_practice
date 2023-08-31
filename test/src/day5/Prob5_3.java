package day5;

public class Prob5_3 {

	public static void main(String[] args) {
		String all = "";
		String odds = "";
		String evens = "";
		int data[] = new int[10];
		int i;
		
		for(i = 0; i < data.length; i++) {
			int num = (int)(Math.random()*100)+1;
			data[i] = num;
			all += num + " ";
			if(num %2 != 0) {
				odds += num + " ";
			} else {
				evens += num + " ";
			}
		}
		System.out.println(all);
		System.out.println();
		System.out.println("奇数：" + odds);
		System.out.println("偶数：" + evens);
	}
}
