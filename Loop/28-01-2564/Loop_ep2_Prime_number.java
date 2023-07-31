import java.util.Scanner;
class Loop_ep2_Prime_number
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = in.nextInt();
		int sum = 0;
		for(int i = 1 ; i <= n  ;i++)  
		{
			if( n % i == 0)
			{
				System.out.println(i);
				sum++;
				
			}
			
		}
		
		if(sum == 2)
		{
			System.out.println(n + " is Prime number ");
		}
		else
		{
			System.out.println(n + " is Not Prime number ");
		}
		
		//System.out.println("number of division " + sum);
		
	}
}
