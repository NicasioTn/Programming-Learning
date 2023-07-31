import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
class practice_File4 
{
	public static void main(String[] args) 
	{
		String in = "offwhite.txt";
		try
		{
			BufferedReader oop = new BufferedReader(new FileReader(in));
			for(;;)
			{
				String x = oop.readLine();// only 1 line
				//String y = oop.readLine();
				if(x == null) // Value Defualt
				{
					break;
				}
				System.out.println(x);
			}
			System.out.println();
		}
		catch(FileNotFoundException ex){
			System.out.println("Program not found");
		}
		catch(IOException ex){
			
		}
		
	}
}
