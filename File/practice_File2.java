import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
class practice_File2 
{
	public static void main(String[] args) 
	{
		String FileName = "offwhite.txt";
		try
		{
			FileInputStream oop = new FileInputStream(FileName);	
			//int x = oop.read();
			for(;;)
			{
				int io = oop.read();
				if(io == -1) // -1 is unknow unicode do stop
				{
					break;
				}
				System.out.print((char)io + "");
			}
			System.out.println();
			
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("Program Not Found " + FileName);
		}
		catch (IOException ex)
		{
			
		}		
	}
}
