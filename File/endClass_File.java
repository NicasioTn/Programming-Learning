import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class endClass_File 
{
	public static void main(String[] args) 
	{
		String fl = "std.xls";
		File mo = new File(fl);
		Scanner in = new Scanner(System.in);
		Scanner on = new Scanner(System.in);
		int Score = 0 ,a = 0 , b = 0;
		String g = "" ;
		try
		{
			FileWriter file = new FileWriter(mo);
			file.write("Code\tFname\tLname\tMidterm\tFinal\tScore\tGrade\t\n");
			for(;;)
			{
				System.out.print("Code : ");
				String code = on.nextLine();
				char num = code.charAt(0);
				if(num == '0')
				{
					break;
				}
				System.out.print("Fname : ");
				String fist = on.nextLine();
				System.out.print("Lname : ");
				String last = on.nextLine();
				System.out.print("midterm : ");
				a = in.nextInt();
				System.out.print("final : ");
				b = in.nextInt();
				Score = a + b ;
				if(Score > 79 )
				{
					g = "A";
				}
				else if (Score > 69)
				{
					g = "B";
				}
				else if (Score > 59)
				{
					g = "C";
				}
				else if (Score > 49 )
				{
					g = "D";
				}
				else 
				{
					g = "F";
				}
				file.write(code+"\t"+fist+"\t"+last+"\t"+a+"\t"+b+"\t"+Score+"\t"+g+"\n");
			}
			file.close();
		}
		catch (IOException ex){}
		
	}
}
