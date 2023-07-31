import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.util.Scanner;
class practice_File6 
{
	public static void main(String[] args) 
	{
		//Scanner in = new Scanner(System.in);
		//String x = in.nextLine();
		String x = "FBI.txt";
		try
		{
			FileOutputStream oop = new FileOutputStream(x,true);
			//FileOutputStream oop = new FileOutputStream(x,); // make file already to use Don't save data
			for(;;)
			{
				char r = (char)System.in.read();	
				if(r == 'z' )
				{
					break;
				}
				oop.write((int)r);
			}
			
		}
		catch (FileNotFoundException ex)
		{
			System.out.println();
		}
		catch (IOException ex) {}
		
	}
}
