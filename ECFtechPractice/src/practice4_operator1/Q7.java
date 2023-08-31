package practice4_operator1;

public class Q7 {

	public static void main(String[] args) {

		int a = 5;
        int b = 10;
        
        a = a + 3;
        System.out.println("a = " + a);
        
        b *= 2;
        System.out.println("b = " + b);
        
        b += ++a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
	}

}
