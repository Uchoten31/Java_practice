package practice1_class;

public class Circle {
	
	double Pl = 3.14;
	int hankei;
	
	public void setHankei(int hankei) {
		this.hankei = hankei;
	}

	public double getEnsyu() {
		return 2 * Pl * hankei;
	}
	
	public double getMenseki() {
		return Pl * hankei * hankei;
	}
	
}
