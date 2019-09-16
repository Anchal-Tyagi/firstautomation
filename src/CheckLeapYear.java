import java.util.Scanner;

/*
 * A leap year is exactly divisible by 4 except for century years (years ending with 00).
 *  The century year is a leap year only if it is perfectly divisible by 400.
 */

public class CheckLeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year = input.nextInt() ;
		boolean isLeap = true ;
		if(year%4==0)
		{
			if(year%100 ==0)
			{
				if(year%400 ==0)
					isLeap = true;
				else
					isLeap = false;
			}
		}
		else
			isLeap = false ;
		
		if (isLeap)
			System.out.println(year + "is a Leap Year");
		else
			System.out.println(year + "is NOT a Leap Year");

	}

}
