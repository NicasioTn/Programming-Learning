import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class practice_File8 
{
	public static void main(String[] args) 
	{
		String file = "Kogofive.txt";
		File fl = new File(file);
		try
		{
			String x = "Hello Msu AND THAILAND";
			FileWriter mo = new FileWriter(fl);
			int m = x.length();
			System.out.println(m);
			// 0 - 2 strat 0 get 2 member
			mo.write(x,0,m);  
			mo.close();
		}
		catch (IOException ex){}
		
		
	}
}
