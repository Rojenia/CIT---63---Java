public class Fraction
{
	public static void main(String[] args)
	{	
		double num = 1;
		double dem = 30;
		double total = 0;
		
		for(int x = 0; x < 30; x ++)
		{
			total += num/dem;
			
			num++;
			dem--;
			
		}
		System.out.println(total);
	}
}