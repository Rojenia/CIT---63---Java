import javax.swing.JOptionPane;

/* This program calculates the sum of seven numbers
from a user.
*/


public class Sum
{
	public static void main(String[] args)
	{
		int num, sum = 0;
		String input;
		
		for(int i = 0; i < 7; i++)
		{
			input = JOptionPane.showInputDialog("Pick an integer: ");
			num = Integer.parseInt(input);
			sum += num;
			
		}
		JOptionPane.showMessageDialog(null, String.format("The sum is %d.", sum));
		
		System.exit(0);
	}
}