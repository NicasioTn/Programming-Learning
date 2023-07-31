import java.util.Scanner ; 
class ForLooP_EX1 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int m = 1 ,n = 0 , sum = 1;
		System.out.print("Enter m : ");
		m = in.nextInt();
		System.out.print("Enter n : ");
		n = in.nextInt();
		int ans = m - n;
		if(ans < 0)
		{
			for(;m<=n;m++)
			{
				System.out.print(m + "x" );
				sum = sum * m;
			}
		}
		else
		{
			for(;m>=n;m--)
			{
				System.out.print(m + "x" );
				sum = sum * m;
			}
		}
		
		System.out.println("\b="+sum);
		
	}
}
