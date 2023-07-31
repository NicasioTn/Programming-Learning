import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
class practice_File5 
{
	public static void main(String[] args) 
	{
		String in = "offwhite.txt";
		
		try
		{
			Scanner oop = new Scanner(new File(in));
			for(;;)
			{
				String a = oop.nextLine();
				System.out.println(a);	
				if(oop.hasNext() == false) break; // case don't need catch(exception)
				// oop.hasNextInt(); Float Long Double use to stop loop
 			}
			
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("Not Found");
		}
		//catch(NoSuchElementException ex ){} 
		// case Don't use if condition to stop
		System.out.println();
	}
}
