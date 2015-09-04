# Approximation-Methods/Runge-Kutta
#Contents

    - **Function.java** - The user must define the function to be approximated in the body of this class.
                          A sample function is provided.

    - **RungeKutta.java** - This program is an implementation of the Runge-Kutta Midpoint Method. 
                            It takes as input a user-defined function, initial conditions t_0 and f_t0,
                            and step size h.


#The default output is the solution to the following problem:

  ![alt tag](Approximation-Methods/Runge-Kutta/Question_15_Ch_5.3_Numerical Methods_J_Faires.png)

  #Output:
  
      At t = 0.01, f(0.01) = 153.11
    	At t = 0.02, f(0.02) = 388.35
    	At t = 0.03, f(0.03) = 710.52
    	At t = 0.04, f(0.04) = 1027.67
    	At t = 0.05, f(0.05) = 1251.32
    	At t = 0.06, f(0.06) = 1402.42
    	At t = 0.07, f(0.07) = 1511.89
    	At t = 0.08, f(0.08) = 1596.26
    	At t = 0.09, f(0.09) = 1664.27
    	At t = 0.10, f(0.10) = 1720.91
    	At t = 0.11, f(0.11) = 1769.22
    	At t = 0.12, f(0.12) = 1811.21
    	At t = 0.13, f(0.13) = 1848.26
    	At t = 0.14, f(0.14) = 1881.34
    	At t = 0.15, f(0.15) = 1911.17
    	At t = 0.16, f(0.16) = 1938.29
    	At t = 0.17, f(0.17) = 1963.14
    	At t = 0.18, f(0.18) = 1986.03
    	At t = 0.19, f(0.19) = 2007.24
    	At t = 0.20, f(0.20) = 2026.98

      Specifically that at t = 0.2 seconds after the reaction, approximately 2026 (2027 rounding up) units of KOH potassium hydroxide will have formed.

#Varying Answers

  The reason this program approximated only (~2027) units of KOT (as compared to the book answer of *2099*) is because
  the step size was limited to (h = .01). A more accurate prediction is given if the number of steps is increased.
  For example, if (h = .001), then this program outputs:
  
       At t = 0.2, f(0.2) = 2079.19.

  Also, the book is likely using a higher order RK-4 method, which would yield a more accurate result as compared to 
  this RK-2 method.
