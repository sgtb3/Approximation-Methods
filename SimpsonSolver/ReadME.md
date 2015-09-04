#Contents

	SimpsonIntegrator.java - This file has the code for the Simpson’s Composite Rule. It contains two methods: 
	
		checkConditions() - checks to ensure the necessary conditions are met to apply Simpson’s rule

		integrate() - takes the parameter values for the endpoints, the number of evaluations, and a user defined function class. It outputs a double value which is the approximate value of the function over over the interval [a,b] and accordance with the parameters provided.

	Function.java - A user-defined function class. By default the Normal Distribution Function with mu=0, sigma=1 is provided.

	SimpsonTester.java - The tester class. By default it is written to test the normal distribution sample problem 

#The default output approximates the solution of the following problem:

![alt tag](https://github.com/sgtb3/Approximation-Methods/SimpsonSolver/Sample_Question.png)

The output is 0.9544992253565711.

The HW problem required the error is less than 10^5. Since the normal distribution is symetrical around x=0, the default values of a,b are 0,2. The resulting value is then multiplied by two. Default value for n is 14.

Since we were looking for the probability that a randomly chosen variable x was on the interval [-2sigma, 2sigma], then according to the 68–95–99.7 rule, the probability was ~0.9545. Therefore our value has an error less than 10^-5.


