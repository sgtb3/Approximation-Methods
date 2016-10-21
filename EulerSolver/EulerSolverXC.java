/**
 * This class implements Euler's Method to solve the differential equation
 * p'(t) = rb(1-p(t), with IC: p(0) = 0.01.
 */
public class EulerSolverXC {

    /* Set appropriate values */
    private static final double n = 50;
    private static final double t0 = 0;
    private static final double p_t0 = 0.01;
    private static final double h = 1;
    private static final double rb = .002;

    /* Defines the function. */
    public static double f(double t, double p_i) {
        return (rb) * (1 - p_i);
    }

    /* Approximates using Euler's method. */
    public static double solve(double n) {

        double p_i = p_t0;
        System.out.println("At t = (" + (int) t0 +
                           "):  p( " + (int) t0 + ") = "+p_i);

        for (double t_i = t0 + h; t_i <= n; t_i += h) {
            p_i = p_i + (h * f(t_i - h, p_i));
            System.out.println("At t = (" + ((int) t_i) +
                               "):  p(" + ((int) t_i) + ") = " + p_i);
        }

        return p_i;
    }

    /* Tester */
    public static void main(String[] args) {
        solve(n);
    }
}
