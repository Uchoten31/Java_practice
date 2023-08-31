package day5;

public class Prob5_5 {

	public static void main(String[] args) {
		String all = "";
		String fizz = "";
		String nfizz = "";
		int i;
		int data[] = new int[10];
		for(i = 0; i < data.length; i++) {
			int num = (int)(Math.random()*10)+1;
			data[i] = num;
			all += num + " ";
			if(num %3 == 0) {
				fizz += num + " ";
			} else {
				nfizz += num + " ";
			}
		}
		System.out.println(all);
		System.out.println();
		System.out.println("3の倍数：" + fizz);
		System.out.println("3の倍数以外の数：" + nfizz);
	}
}
