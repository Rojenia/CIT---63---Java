import javax.swing.JOptionPane;

public class RunTotal
{
	public static void main(String[] args)
	{
		String num;
		int ans;
		int sum = 0;
		
		for(int i = 0; i < 10; i++)
		{
			num = JOptionPane.showInputDialog("Pick a number: ");
			
			ans = Integer.parseInt(num);
			
			sum += ans;
		}
		
		JOptionPane.showMessageDialog(null, "The total sum of all numbers is " + sum);
	}
}