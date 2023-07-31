import java.util.Scanner ; 
class  ComPare
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("GRADE : " );
		char grade = in.next().charAt(0);
		String comMent= " " ; 
		if(grade == 'A' || grade == 'a')
		{
			comMent = "EXCELLENT";
		}
		else if (grade == 'B' || grade == 'b')
		{
			comMent = "GOOD";
		}
		else if (grade == 'C' || grade == 'c' )
		{
			comMent = "PASS";
		}
		else if (grade == 'D' || grade == 'd')
		{
			comMent = "FAIR";
		}
		else if(grade == 'F' || grade == 'f')
		{
			comMent = "FAIL";
		}
		System.out.println("GRADE : " + grade + " , " + comMent);

	}
}
