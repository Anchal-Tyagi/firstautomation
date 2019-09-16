/*
 * Problem Statement : write a program that prints out numbers from 1 to 100 
 * under the following conditions: Multiples of three, (3, 6, 9, 12, etc.) 
 * must be replaced by the word Fizz in the printout, 
 * multiples of five, (5, 10, 15, 25, etc.) must be replaced by Buzz, and 
 * multiples of both three and five (15, 30, 45, etc.) must be replaced by FizzBuzz.
 * 
 */


public class FizzBuzzChallenge {

	public static void main(String[] args) {
		for(int i=1 ; i<=100 ; i++)
		{
			if (i%3==0 && i%5==0)
				System.out.println("FizzBuzz");
			else if (i%5==0)
				System.out.println("Buzz");
			else if (i%3==0)
				System.out.println("Fizz");
			else
				System.out.println(i);
		}

	}
	
/*Algorith to write the above code
 * 
 * for number in range(1,101) :
 * 		if number%3==0 and number%5==0
 * 				print("FizzBuzz")
 *      elseif number%3
 *      .....   
 *   
 * 
 * 
 */

}
