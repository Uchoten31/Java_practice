package exday5;

import java.util.ArrayList;

public class ProbEx5_3 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		while(true){
			int num = (int)(Math.random()*101);
			System.out.println("0～100の値を出力:" + num);
			if(num == 0) {
				break;
			}
			list.add(num);
		}
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			String result = "";
			for(int v : list) {
				if(v % 10 == i) {
					result += v + " ";
				}
			}
			if(result.equals("")) {
				result = "なし";
			}
			System.out.println("一の位が" + i + "：" + result);
		}
		
	}

}
