import java.util.Scanner;

/**
	This program asks the user if they wants to exit it
*/

public class Quit{
	public static void main(String[] args){
	
		Scanner keyboard = new Scanner(System.in);
		
		char choice;
		String input;
		
		do {
			System.out.println("Would you like to quit " +
							"the program? (Q/R)");
							
			input = keyboard.nextLine();
			
			choice = input.charAt(0);
			choice = Character.toUpperCase(choice);
			
		} while (choice.matches('R') && choice.matches('Q'));
		
		System.out.println("You are now out of the program");
	}
}