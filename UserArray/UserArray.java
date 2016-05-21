import java.util.Scanner;

/*
The program ask the user how many items are in the list
and prints them to the user.
*/


public class UserArray
{
	public static void main(String[] args)
	{
		double[] values;
		int num;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many items are in the list? ");
		num = keyboard.nextInt();
		
		values = new double[num];
		
		for(int index = 0; index < num; index++)
		{
			int place = index + 1;
			double item = 0.0 ;
			System.out.println("What is item number " + place +
								" in the list");
								
			item = keyboard.nextDouble();
			
			values[index] = item;
		}
		for(int index = 0; index < num; index++)
		{
			System.out.println(values[index]);
		}
		System.out.println("Fin");
	}	
}