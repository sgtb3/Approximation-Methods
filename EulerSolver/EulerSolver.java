/**
 * This class implements Euler's Method to solve the differential equation
 * mv'= mg-kv|v|, with IC: v(0) = 8 meters/second.
 *
 * f = (-9.8) - (0.002/0.11) * v^2
 */
public class EulerSolver {

    private double m;

    //function
    public double f(double v_i) {
        double g = -9.8;
        double k = 0.002;
        return g - ((k/m) * Math.pow(v_i, 2));
    }

    //approximate using Euler's Method
    public void solve(double mass, int t0, double v_t0, double a, double b, double n){

        this.m = mass;
        int t = t0;
        double h = (b - a) / n;
        double v_i = v_t0;
        System.out.println("At t = ("+t0+"), v("+t0+") = "+v_i);

        for (int i = 0; i < n; i++) {
            v_i = v_i + h*f(v_i);
            t = t + h;
            System.out.println("At t = ("+(i+1)+"), v("+(i+1)+") = "+v_i);
        }
    }

    public static void main(String[] args) {

        double b = 1;
        double a = 0;
        double n = 10;

        double m = 0.11;
        int t0 = 0;
        double v_t0 = 8.0;

        EulerSolver es = new EulerSolver();
        es.solve(m, t0, v_t0, a, b, n);
    }
}
