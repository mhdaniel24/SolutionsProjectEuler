/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 */
package Solutions;

public class Problem1 extends Problem{
	
	public void solve(){ 
		int lastnum = 999;
       	int number = 0;//increasing numbers
       	int accumulator = 0;
       
       	while (number < lastnum)
       	{
       		number = number +1;
           
        	if((number%3 == 0)||(number%5 == 0))//choosing them if they are divisible by 3 or 5
        	{
        		accumulator = accumulator + number;
        	}
       }
       	solution = accumulator *1.0;
       	
       	printSolution();
	}
	
	void printSolution(){
		System.out.println(Problem1.class.getSimpleName() + " solution = " + solution);
	}
	
}
