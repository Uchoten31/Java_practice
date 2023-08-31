package practice6_branch2;

public class Q4 {
	
	public static void main(String[] args) {

		int a = 12;
        int b = 6;
        if ( (a >= 5 && a <= 10) && b == 8) {
            System.out.println("条件1に該当");
        }
        if(!(b == 3 || b == 6 || b == 9)){
            System.out.println("条件2に該当");
        }
    
	}
}
