import java.util.Scanner;

/**
	This program counts the number of uppercase letters are in a string
*/

public class Count{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		String input;
		char ch;

		int count = 0;
		
		System.out.println("Enter a sentence: ");
		
		input = keyboard.nextLine();

		for(int index = 0; index < input.length(); index ++){
		
			ch = input.charAt(index);
			if (Character.isUpperCase(ch)){
			

				count++;
			}
		}
		
		System.out.println("There are this many uppercase letters: " + count);
		
	}

}