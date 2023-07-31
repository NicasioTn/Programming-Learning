import java.io.IOException;
class Docss 
{
	public static void main(String[] args) 
	{
		String str = "A Ri Ga To";
		StringBuffer ad = new StringBuffer("A Ri Ga To");
		
		//StringBuffer x = ad.append(str);
		//StringBuffer b = ad.insert(10,"TEN"); 
		StringBuffer b = ad.reverse();
		System.out.println(b);
		Runtime rn = Runtime.getRuntime();
		try
		{
			rn.exec("C:\\Program Files (x86)\\CodeBlocks\\codeblocks.exe");	
		}
		catch (IOException ex)
		{
		}
		 
	}
}
