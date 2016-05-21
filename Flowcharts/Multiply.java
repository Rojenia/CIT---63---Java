import javax.swing.JOptionPane;

public class Multiply
{
	public static void main(String[] args)
	{
		int num, prod, num1;
		String sNum;
		
		sNum = JOptionPane.showInputDialog("Enter a number: ");
		
		num = Integer.parseInt(sNum);
		while(num < 100)
		{
			num = num * 10;
		}
		JOptionPane.showMessageDialog(null, num);
	}
}