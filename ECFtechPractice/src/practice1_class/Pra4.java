package practice1_class;

public class Pra4 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        c1.setTax(0.08);
        c2.setTax(0.1);

        System.out.println("税込(8%)" + c1.calc(1000));
        System.out.println( "税込(10%)" + c2.calc(1000) );
		
	}

}
