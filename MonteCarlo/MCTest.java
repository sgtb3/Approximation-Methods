/**
 * This is the tester for the MonteCarlo class.
 * The user must modify the Function class with the 
 * function that is to be approximated.
 */

public class MCTest {

    public static void main(String[] args) throws Exception {

        MonteCarlo MC = new MonteCarlo();

        //number of evaluations
        double n = 1000000;

        //bounds for upper and lower limits of integration
        double xl = 0;
        double xu = 0.5;
        double yl = 1;
        double yu = 2;
        double zl = 0;
        double zu = 1;

        MC.estimator(xl, xu, yl, yu, zl, zu, 100);
        MC.estimator(xl, xu, yl, yu, zl, zu, 1000);
        MC.estimator(xl, xu, yl, yu, zl, zu, 10000);
        MC.estimator(xl, xu, yl, yu, zl, zu, 100000);
        MC.estimator(xl, xu, yl, yu, zl, zu, 1000000);

        //---- For testing purposes only----//
        //MC.estimator(xl,xu,n);
        //MC.estimator(xl,xu,yl,yu,n);
    }
}