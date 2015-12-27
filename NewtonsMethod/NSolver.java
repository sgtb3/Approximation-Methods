public class NSolver {

    public static void main(String[] args) {

        //define total number of iterations (or epsilon) and initial value
        int iter = 2;
        double epsilon = .00001;

        double t_0 = 0.2;
        int iterCounter = 1;

        //if choosing to terminate with epsilon then replace the
        //while loop cond w/ iterCounter <= iter, Math.abs(I(t_0)) > epsilon
        while (iterCounter <= iter) {
            
            t_0 = t_0 - I(t_0) / I1(t_0);

            //output current data to console
            System.out.print("Iteration# " + iterCounter);
            System.out.print(", Current (t): " + t_0);
            System.out.println(", Current I(t): " + I(t_0));

            //check if abs value of of function is within epsilon.
            //if root is found this will break out of loop.
            //this only applies if using epsilon terminating condition.
            if (Math.abs(I(t_0)) <= epsilon) {
                break;
            }
            iterCounter++;
        }

        //output final data to console
        if (Math.abs(I(t_0)) <= epsilon) {
            System.out.println("The root I(t)=0 is at t = " + t_0);
        } else {
            System.out.print('\n'+"After "+(iterCounter-1)+" iterations, the final ");
            System.out.println("approximation of the root ");
            System.out.print("is t = "+t_0+", where I(t) = "+I(t_0)+'\n');
        }
    }

    //define your I(t) in the body of this method
    //I(t)=1000[1-(1+t)^-30]-135000t
    public static double I(double t) {
        return (1000) * Math.pow(1 - (1 + t), -30) - 135000 * t;
    }

    //define your I'(t) in the body of this method
    //I'(t)=[30000/(t+1)^31] - 135000
    public static double I1(double t) {
        return (30000 * Math.pow(t + 1, -31)) - 135000;
    }
}
