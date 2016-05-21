import java.util.Scanner;

public class LargestofThreeUser
{
	public static void main(String[] args)
	{
        //Declare variables
		int a, b, c;
		
        //Input from user
        System.out.println("Pick three integers: ");
		
		Scanner keyboard = new Scanner(System.in);
		
		a = keyboard.nextInt();
		b = keyboard.nextInt();
		c = keyboard.nextInt();
		
        //process to determine largest number
		if(b < a)
		{
            if(a > c)
            {
                for(int i = 1; i<=10; i++)
                    {
                        System.out.println("The largest number between of " + a + ", " + b + ", " + c + " is " + a);
                    }
            }
            else
            {
                for(int i = 1; i<=10; i++)
                {
                    System.out.println("The largest number between of " + a + ", " + b + ", " + c + " is " + c);
                }
            }
        }
        
		else
		{
            if (b > c)
            {
                for(int i = 1; i<=10; i++)
                    {
                        System.out.println("The largest number between of " + a + ", " + b + ", " + c + " is " + b);
                    }
            }
            else
            {
                for(int i = 1; i<=10; i++)
                {
                    System.out.println("The largest number between of " + a + ", " + b + ", " + c + " is " + c);
                }
            }
            
		}
		
	}
}