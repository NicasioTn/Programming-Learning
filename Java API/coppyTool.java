class coppyTool 
{
	public static void main(String[] args) 
	{
		char ch[] = {'A','B','C','D','e','F','G','h','k'};
		
		String x = String.copyValueOf(ch,0,5);
		// 0 strat point
		// 5 is end of point 
		System.out.println(x+"\n-----------------------\n");
		
		String str = "TestsA@msu.ac.th" ;
		boolean y = str.endsWith("@msu.ac.th");
		boolean y2 = str.startsWith("Tests");
		System.out.println(y2); 

	}
}
