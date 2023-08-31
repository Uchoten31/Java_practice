package practice12_abstraction_polymorphism;

public class Q2 {

	public static void main(String[] args) {

		Transferable[] parts = {
	            new Switch(),
	            new Router()
	        };

	        for (Transferable work : parts) {
	            work.transfer();
	        }
		
	}

}
