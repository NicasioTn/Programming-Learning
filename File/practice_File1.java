import java.io.IOException;
class practice_File1 
{
	public static void main(String[] args) 
	{
		String sum = "";
		try
		{
			for(;;)
			{
				int x = System.in.read();	
				
				//System.out.println(x);
				//System.out.println((char)x);
				if(x == -1 ) // control + z == -1(unicode unknow)
				{
					break;	
				}
				sum += (char)x; 
			}
			System.out.print(sum);
		}
		catch (IOException ex){}
		
		
	}
}