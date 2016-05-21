import java.io.*;
import javax.swing.JOptionPane;

public class Name
{
	public static void main(String[] args) throws IOException
	{
		String filename;
		String fName;
		
		filename = JOptionPane.showInputDialog("Enter a filename: ");
		PrintWriter outputFile = new PrintWriter(filename);
		
		fName = JOptionPane.showInputDialog("What is your first name? ");
		
		outputFile.println(fName);
		
		outputFile.close();
	}
}