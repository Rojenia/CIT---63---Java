import java.util.Scanner;
import java.io.*;

public class LargestofThreeFile
{
	public static void main(String[] args) throws IOException
	{
        //Declare variables
		int a, b, c;
		
        //Input form file
        System.out.println("Reading from file numbers.txt ");
        File numberFile = new File("numbers.txt");
		Scanner input = new Scanner(numberFile);
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
        //Process.. to determine largest number
		if(b < a)
		{
            if(a > c)
            {
                for(int i = 1; i<=10; i++)
                    {
                        System.out.println("The largest number between " + a + ", " + b + ", " + c + " is " + a);
                    }
            }
            else
            {
                for(int i = 1; i<=10; i++)
                {
                    System.out.println("The largest number between " + a + ", " + b + ", " + c + " is " + c);
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
        //close file
        input.close();
		
	}
}