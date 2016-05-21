import java.io.*;
import java.util.Scanner;

public class Read
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\nEnter the filename: ");
		String filename = keyboard.nextLine();
		
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);
		
		String line = inputFile.nextLine();
		
		System.out.println("\n\nFirst line in the file is: ");
		System.out.println(line);
		System.out.println("\n");
		inputFile.close();
	}
}