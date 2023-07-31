import java.util.Scanner ;
class MethArr_najafianl
{
	public static void main(String[] args) // Send Point of Arr
	{
		MethArr oop = new MethArr();
		int n = 5 ;
		String a[][] = new String[n][n];
		oop.startG(a); // 1
		oop.printOut(a); // 2
		for(;;)
		{
			read menu
			if()
				if 
		}
			oop.setO(0,2,a); // 3
			oop.printOut(a); // 4
			oop.setX(4,1,a);
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
			for(int j = 0 ; j <x.length ;j++)
			{
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
	}
	void setO(int i ,int j , String x[][])
	{
		x[i][j] = "O";	
	}
	void setX(int i ,int j , String x[][])
	{
		x[i][j] = "x";	

	}
}
