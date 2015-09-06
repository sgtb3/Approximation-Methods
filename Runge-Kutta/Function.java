/**
 * A user defined function class.
 * bnb2115@columbia.edu
 */
public class Function {

    //A first-order nonlinear ODE
    public double dx(double t, double x_t) {
        double k = 6.22e-19;
        double n1 = 2e3;
        double n2 = 2e3;
        double n3 = 3e3;

        return (k) * Math.pow(n1-(x_t/2), 2) 
        	   * Math.pow(n2-(x_t/2), 2) 
                   * Math.pow(n3-(3 * (x_t/4)), 3);
    }
}
