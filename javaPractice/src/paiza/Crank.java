package paiza;

import java.util.Scanner;

public class Crank {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        
	        for(int i = 0; i < N; i++){
	            String s = sc.next();
	            int a = sc.nextInt();
	            System.out.println(s + " " + a);
	        }

	}

}
