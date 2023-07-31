import java.util.Scanner ;
class MethArr
{
	public static void main(String[] args) // Send Point of Arr
	{
		MethArr oop = new MethArr();
		int n = 5 ;
		String a[][] = new String[n][n];
		oop.startG(a);
		oop.printOut(a);
		
	}
	void startG(String x[][]) // Prass by Reference
	{
		for(int i = 0 ; i <x.length ; i++)
		{
			for(int j = 0 ; j <x.length;j++)
			{
				x[i][j] = "_";
			}
		}
	
		//return x;
	}
	void printOut(String x[][])
	{	
		
		for(int i = 0 ; i <x.length ; i++)
		{
			for(int j = 0 ; j <x.length;j++)
			{
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
