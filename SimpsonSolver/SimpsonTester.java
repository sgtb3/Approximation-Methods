public class SimpsonTester {

    public static void main(String[] args) {

        double a = 0;
        double b = 2;
        double n = 14;

        Function NDF = new Function();
        SimpsonIntegrator simp = new SimpsonIntegrator();
        System.out.println(simp.integrate(a, b, n, NDF) * 2);
    }
}
