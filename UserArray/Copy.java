
/*
This program copies one array a to array b
*/




public class Copy
{
	public static void main(String[] args)
	{
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		int[] b = new int[7];
		
		for(int index = 0; index < a.length; index++)
		{
			b[index] = a[index];
		}
		
		for(int index = 0; index < a.length; index++)
		{
			System.out.println("array a: " + a[index] + "\t" + 
								"array b: " + b[index]);
		}
		System.out.println("Fin");
	}
}