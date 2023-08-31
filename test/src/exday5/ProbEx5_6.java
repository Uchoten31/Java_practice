package exday5;

import java.util.ArrayList;
import java.util.Iterator;

public class ProbEx5_6 {

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
		
		//	イテレータを使用して、2をremoveする
		Iterator<Integer> ite = list.iterator();
		while(ite.hasNext()) {
			int i = ite.next();
			if(i == 2) {
				ite.remove();
			}
		}
		
		
		for(int j : list) {
			System.out.print(j + " ");
		}
		
		
	}

}
