import java.util.Scanner ;
class Break_char_EX1
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String sum = " " , sum1 = " ";
		for(;;)
		{
			System.out.print("Enter Except 'q' : ");
			String chaR = in.next();
			if(chaR.equals("q") || chaR.equals("Q"))
			{
				System.out.println("End");
				
				break;
			}
			sum1 = sum + chaR; 
			sum = chaR + sum ;

		}
		System.out.println("All " + sum1 + " " + sum);

	}
}