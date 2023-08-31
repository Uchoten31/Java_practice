package practice6_branch2;

public class Q2 {
	
	public static void main(String[] args) {

		int age = 18;
        boolean parent = false;
        if (age <= 12) {
        	if(parent) {
        		System.out.println("ご参加頂けます");
        	} else {
        		System.out.println("ご参加頂けません");
        	}
        } else {
            System.out.println("ご参加頂けます");
        }
    
	}
}
