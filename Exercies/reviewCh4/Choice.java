import javax.swing.JOptionPane;


public class Choice
{
	public static void main(String[] args)
	{
		int a, b, sum;
		String c;
		String ans;
		do
		{
			// Prompt user
			JOptionPane.showMessageDialog(null, "Pick two numbers to add");
											
			//First number
			c = JOptionPane.showInputDialog("First number: ");
			a = Integer.parseInt(c);
			
			// Second number
			c = JOptionPane.showInputDialog("Second Number: ");
			b = Integer.parseInt(c);
				
			sum = a + b;
				
			JOptionPane.showMessageDialog(null, "Sum is " + sum);
			
			ans = JOptionPane.showInputDialog("Continue? Type Yes or No.");
		} while(ans != "No" || ans != "no");
	}
}