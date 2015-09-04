/**
 * User defined function class.
 */
public class Function {

    //Example of single variable function: f(x) = x^2
    public double f(double x) {
        return Math.pow(x, 2);
    }

    //Example of double variable function: (x+y)^2
    public double f(double x, double y) {
        return Math.pow(x + y, 2);
    }

    //Example of triple variable function: e^(x+y+z)
    public double f(double[] input) {
        return Math.exp(input[0] + input[1] + input[2]);
    }
}
