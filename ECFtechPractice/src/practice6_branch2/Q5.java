package practice6_branch2;

public class Q5 {
	
	public static void main(String[] args) {

		int age = 19;
        boolean members = true;
        int fee = 0;
        //ここにプログラムを追加します。
        if(age >= 20) {
        	if(members) {
        		fee = 1100;
        	} else {
        		fee = 1500;
        	}
        } else {
        	if(members) {
        		fee = 500;
        	} else {
        		fee = 800;
        	}
        }

        System.out.println("料金は" + fee + "円です");
    
	}
}
