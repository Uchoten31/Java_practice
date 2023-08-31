package exday5;

import java.util.ArrayList;

public class ProbEx5_2 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		while(true){
			int num = (int)(Math.random()*11);
			System.out.println("0～10の値を出力:" + num);
			if(num == 0) {
				break;
			}
			list.add(num);
		}
		System.out.println();
		
		for(int i = list.size()-1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
		
	}

}
