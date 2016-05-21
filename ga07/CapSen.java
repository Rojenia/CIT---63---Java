import java.util.Scanner;

/**
	This program converts uppercase letters to lowercase.
**/

public class CapSen
{
	public static void main(String[] args)
	{
		
		//Create a Scanner object to read keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		String input;
		
		System.out.println("This program captalizes the beginning of every sentence");
		System.out.println("Enter one or more sentences; ");
		
		input = keyboard.nextLine();
		
		upperSen(input);
	}




	public static void upperSen(String str)
	{
		int length;
		
		length = str.length();
	
		char[] letter = new char[length];
	
		letter = str.toCharArray();
	
		for(int index = 0; index < length; index++)
		{	
			if (index == 0)
			{
				System.out.print(Character.toUpperCase(letter[index]));
				index++;
			}
			
			System.out.print(letter[index]);
			
			
			if (letter[index] == '.' && index + 2 < length)
			{
				index = index + 2;
				System.out.print(" " + Character.toUpperCase(letter[index]));
			}
			else if(letter[index] == '!' && index + 2 < length)
			{
				index = index + 2;
				System.out.print(" " + Character.toUpperCase(letter[index]));
			}
			else if(letter[index] == '?' && index + 2 < length)
			{
				index = index + 2;
				System.out.print(" " + Character.toUpperCase(letter[index]));
			}

		}
		System.out.println();
	}
}