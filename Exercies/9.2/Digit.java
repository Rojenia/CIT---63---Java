import java.util.Scanner;

/**
	This program tells the user if their input is a digit
*/
public class Digit {
	public static void main(String[] args){
	
		Scanner keyboard = new Scanner(System.in);
	
		char ch;
		String input;
		
		System.out.println("Enter a character: ");
		input = keyboard.nextLine();
		
		ch = input.charAt(0);
		
		if (Character.isDigit(ch)) {
			System.out.println("Digit.");
		}
		else {
			System.out.println("Not a digit.");
		}
	}
}