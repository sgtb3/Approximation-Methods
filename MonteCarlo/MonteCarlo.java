/**
 * This class is an implementation of the Monte Carlo Method
 * for finding the approximate value of a function over some given
 * interval(s). It provides three overloaded estimator() methods
 * which approximate a user-defined method given some parameters.
 */

import java.util.Random;

public class MonteCarlo {

    private Random rand;
    private Function func;

    public MonteCarlo(){
        func = new Function();
        rand = new Random();
    }

    /**
     * This method estimates the approximate value of a user defined
     * single variable function using the Monte Carlo method.
     */
    public double estimator(double lower, double upper, double itr) {

        //if bounds are backwards swap them
        if (upper < lower) {
            return estimator(upper, lower, itr);
        }

        double sum = 0;
        double randX;

        for (double i = 0; i < itr; i++) {
            randX = rand.nextDouble();
            sum += func.f(lower + ((upper-lower) * randX));
        }

        //divide sum by n iterations
        sum *= (upper - lower) / itr;
        System.out.printf("Approximate value of the single var function f ");
        System.out.println("with n = " + itr + " is: " + sum);
        return sum;
    }

    /**
     * This method estimates the approximate value of a user defined
     * double variable function using the Monte Carlo method.
     */
    public double estimator(double xl, double xu, double yl,
                            double yu, double itr) {

        //if any of the bounds are backwards swap them
        if (xu < xl) {
            return estimator(xu, xl, yl, yu, itr);
        }
        if (yu < yl) {
            return estimator(xl, xu, yu, yl, itr);
        }

        final int numVars = 2;
        double[] rInput = new double[numVars];
        double sum = 0;

        for (int i = 0; i < itr; i++) {
            rInput[0] = xl + (xu-xl) * rand.nextDouble();
            rInput[1] = yl + (yu-yl) * rand.nextDouble();
            sum += func.f(rInput[0], rInput[1]);
        }
        sum = sum * (xu-xl) * (yu-yl) / itr;
        System.out.printf("Approximate value of the double var function f ");
        System.out.println("with n = " + itr + " is: " + sum);
        return sum;
    }

    /**
     * This method estimates the approximate value of a user defined
     * triple variable function using the Monte Carlo method.
     */
    public double estimator(double xl, double xu, double yl,
                            double yu, double zl, double zu,
                            double itr){

        //if any of the bounds are backwards swap them
        if (xu < xl) {
            return estimator(xu, xl , yl, yu, zl, zu, itr);
        }
        if (yu < yl) {
            return estimator(xl, xu, yu, yl, zl, zu, itr);
        }
        if (zu < zl) {
            return estimator(zl, zu, yl, yu, zl, zu, itr);
        }

        final int numVars = 3;
        double sum = 0;
        double[] rInput = new double[numVars];

        for (int i = 0; i < itr; i++) {
            rInput[0] = xl + (xu-xl) * rand.nextDouble();
            rInput[1] = yl + (yu-yl) * rand.nextDouble();
            rInput[2] = zl + (zu-zl) * rand.nextDouble();

            sum += func.f(rInput);
        }
        sum = sum * (xu-xl) * (yu-yl) * (zu-zl) / itr;
        System.out.printf("Approximate value of the tripple var function f ");
        System.out.println("with n = " + itr + " is: " + sum);
        return sum;
    }
}
