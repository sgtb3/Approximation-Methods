public class Bisection {

    public static void main(String[] args) {

        /* provide some interval[a1,b1], where f(a1) < 0 and f(b1) > 0 */
        double a1 = 2.5;
        double b1 = 3.0;

        /* the midpoint */
        double p = 0;

        /* fp = function evaluated @ p, fa = function evaluated @ a */
        double fp = 0;
        double fa = 0;

        /* indicate tolerance/epsilon level, here it is set to 10^(-4) */
        double tol = 0.00001;

        /* counter variable to keep track of total # of iterations */
        int counter = 0;

        /*
         * keep iterating while the current interval remains below the 
         * desired tolerance level
         */
        while (b1 - a1 > tol) {

            /* define p as the midpoint of the current interval's endpoints */
            p = (a1 + b1) / 2;

            /*
             * evaluate p in the function f(p) = p^3 - 25, however these 
             * variables can be modified for different polynomial functions
             */
            fp = Math.pow(p, 3) - 25.0;
            fa = Math.pow(a1, 3.0) - 25.0;

            /* 
             * call the checkSign() method to determine which endpoint
             * needs to be changed.
             */
            if (checkSign(fp, fa))
                b1 = p;
            else if (!checkSign(fp, fa))
                a1 = p;

            /* display the current interval */
            System.out.println("Current interval [" + a1 + "," + b1 + "]");
            counter++;
        }

        /* display total number of evaluations and approx to within epsilon */
        System.out.println("Approx took " + counter + " evaluations");
        System.out.println("Approx to within " + tol + " = " + (a1 + b1) / 2);
    }

    
    /**
     * Checks if parameters of of opposite signs.
     * 
     * @param  : Double value1.
     * @param  : Double value2.
     * @return : True - if f1 and f1 have different signs.
     *           Fale - otherwise.
     */
    public static boolean checkSign(double f1, double f2) {
        
        boolean sign = false;
        
        if (f1 > 0 && f2 < 0)
            sign = true;
        else if (f1 < 0 && f2 > 0)
            sign = true;
        else if (f1 > 0 && f2 > 0)
            sign = false;
        else if (f1 < 0 && f2 < 0)
            sign = false;

        return sign;
    }
}

