/**
 * This class implements the Second Order Runge-Kutta Method.
 * The user must define a function in the Function.java class
 * bnb2115@columbia.edu
 */

public class RungeKutta {

    /**
     * This method approximates the function at various values of time t
     * using Runge-Kutta Order 2.
     *
     * @param f user defined function
     * @param t0 initial condition time value
     * @param y_t0 initial condition function value at time t = 0
     * @param tf final value for t (terminating condition)
     * @param h step size
     */
    public void solve(Function f, int t0, double y_t0, double tf, double h) {

        double f_ti = y_t0;
        double t = t0;

        do {
            double alpha = h / 2;
            double beta = alpha * f.dx(t, f_ti);

            f_ti = f_ti + (h * f.dx(t + alpha, f_ti + beta));
            t = t + h;

            System.out.printf("%s%.2f", "At t = ", t);
            System.out.printf("%s%.2f%s%.2f%c", ", f(", t, ") = ", f_ti, '\n');

        } while(t < tf);
    }

    public static void main(String[] args) {

        //Set appropriate values
        double tf = 0.2;
        int t0 = 0;
        double y_t0 = 0;
        double h = 0.01;

        RungeKutta rk = new RungeKutta();
        rk.solve(new Function(), t0, y_t0, tf, h);
    }
}
