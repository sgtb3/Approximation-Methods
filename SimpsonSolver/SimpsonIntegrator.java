/**
 * An application of the Composite Simpson's Rule for approximating functions.
 */
public class SimpsonIntegrator {

	private double a;
	private double b;
	private double n; //number of evaluations

	//checks if parameters are valid.
	public boolean checkConditions() {
		if (n % 2 != 0) {
			n++;
			System.out.print("The provided (n) value was not even, ");
			System.out.println("(n) has been incremented");
		}
		if (a > b) {
			System.out.print("Invalid parameters. (a) must be less than (b). ");
			System.out.println("Please check and recompile.");
			return false;
		}
		if (n < 0) {
			System.out.print("Invalid parameters. (n) must be greater than (0). ");
			System.out.println("Please check and recompile.");
			return false;
		}
		return true;
	}

	/**
    * Composite Simpson's Rule.
    * @param a lower bound
    * @param b upper bound
    * @param n number of evaluations
    * @param func user defined function class
    */
	public double integrate(double a, double b, double n, Function func) {
		this.a = a;
		this.b = b;
		this.n = n;
		double h = (b - a) / this.n;

		double dx = (a + h);
		double x  = (a + dx);
		double t1 = func.f(a);
		double t4 = func.f(b);
		double t3 = func.f(x);
		double t2 = 0;

		if (!checkConditions()) {
			System.out.println("Invalid parameters. Recompile.");
			System.exit(1);
		}
		for (int j = 1; j <= (n - 2)/2; j++) {
			x  += dx;
			t2 += func.f(x);
			x  += dx;
			t3 += func.f(x);
		}
		return (dx / 3) * (t1 + (2 * t2) + (4 * t3) + t4);
	}
}







