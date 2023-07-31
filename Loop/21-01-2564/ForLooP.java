import java.util.Scanner ; 
class ForLooP 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int i = 1 ,n = 0 , sum = 0;
		n = in.nextInt();
		for(; i <= n; i++)
		{
			
			System.out.print(i + "\t");
			int j = i % 7 ;
			if(j == 0)
			{
				System.out.println();
			}
		}
		System.out.println();
	}
}
