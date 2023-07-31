import java.util.Scanner ; 
class LooPWhile 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int x = 1, y = 0,sum = 0;
		System.out.print("Enter Round : ");
		y = in.nextInt();
		while(x<=y)
		{
			
			System.out.print(x+ "+");
			sum += x;
			x += 1 ;

		}
		System.out.println("\b=" + sum);
	}
}
