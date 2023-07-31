import java.util.StringTokenizer;
class DocsTool 
{
	public static void main(String[] args) 
	{
		String str = "cbad 100 bb 41 nn 22";
		StringTokenizer rn = new StringTokenizer(str);
		//int a = rn.countTokens();
		String a = "";
		for(int i = 1 ;rn.hasMoreTokens(); i++)
		{
			a = rn.nextToken();	
			System.out.println(a);
		}
		
		
	}
}
