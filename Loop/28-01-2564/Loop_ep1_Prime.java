import java.util.Scanner;
class Loop_ep1_Prime 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = in.nextInt();
		for(int i = 1 ; i <= n  ;i++)  // sam prime number
		{
			if( n % i == 0)
			{
				System.out.println(i);	
			}
		}
		
	}
}
