import java.util.Scanner;
class  Ex_02
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int sum = 0;
		for(;;)
		{
			System.out.print("Enter int Except 13 : ");
			int x = in.nextInt();
			
			if(x == 13)
			{
				System.out.println("End");
				x = 0;
				break;
				
			}
			sum = sum + x ;
		}
		System.out.println("sum = " + sum);
		
	}
}
