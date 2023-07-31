import java.util.Scanner ;
class Break_char
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		for(;;)
		{
			System.out.print("Enter Except 'q' : ");
			String chaR = in.next();
			if(chaR.equals("q") || chaR.equals("Q"))
			{
				System.out.println("End");
				break;
			}

		}
	}
}