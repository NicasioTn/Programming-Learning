import java.io.IOException;
class CharIF
{
	public static void main(String[] args) 
	{
		
		try
		{
			System.out.print("GRADE : ");
			char grade =(char)System.in.read(); // Scan
			String comMent = " ";

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
		catch (IOException nnn)
		{
		}
		
		
		
	}
}