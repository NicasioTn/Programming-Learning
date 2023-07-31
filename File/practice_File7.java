import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class practice_File7 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String name = "Book.xls";
		String x = " " ; 
		try
		{
			PrintWriter oop = new PrintWriter(new BufferedWriter(new FileWriter(name,true)));
			for(;;)
			{
				x = in.nextLine();
				if(x.equals("stop")) 
				{
					break;	
				}
				oop.write(x);
			}
			oop.close();
		}
		catch (IOException ex ){}
		
		
	}
}
