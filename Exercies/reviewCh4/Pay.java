import java.util.Scanner;



public class Pay

{
	public static void main(String[] args)
	{
		int hours;
		double payRate;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many hours did you work?: ");
		hours = keyboard.nextInt();
		
		System.out.print("How much do you get paid hourly?: ");
		payRate = keyboard.nextDouble();
		System.out.print("\n");
		
		if (hours > 40)
		{
			System.out.println(payRate * 1.5);
		}
	
	}
}