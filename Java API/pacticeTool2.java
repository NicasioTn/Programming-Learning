class pacticeTool2
{
	public static void main(String[] args) 
	{
		/*char ch[] = {'A','B','C','D','e','F','G','h','k'};
		
		String x = String.copyValueOf(ch,0,5);
		// 0 strat point
		// 5 is end of point 
		System.out.println(x+"\n-----------------------\n");
		
		String str = "TestsA@msu.ac.th" ;
		boolean y = str.endsWith("@msu.ac.th");
		boolean y2 = str.startsWith("Tests");
		System.out.println(y2); 
		*/
		
		String str = "TestsA@msu.ac.th" ;
		/*int x = str.indexOf("h");
		System.out.println(x); 
		int y = str.length();
		System.out.println(); */

		String x = str.replace('@','1');
		String y = str.replace("TestsA","Peter");
		// take 1 replace at @ 
		// paramitor 1 is index
		// paramitor 2 is new char replace 
		System.out.println();
		
		String a = str.substring(6,10);
		// sub to many String do you input as 1  
		// if you input 2 value 1 , 5 
		// will get (1,5) get only 2-4
		System.out.println();
		
		String b = str.toUpperCase();
		String c = str.toLowerCase();
		//System.out.println(c);
		
		/*String e[] = str.split("@"); // cut line and sub input
		for(int i = 0 ; i < e.length ; i++)	
		{
			System.out.println(e[i]);	
		}*/

		String sstr = "Hello";
		String sstr1 = "ten";
		String g = sstr.concat(sstr1);
		//System.out.println(g);

		boolean p = str.contains("TH"); // chek t f as Gmail
		System.out.println(p);
	}
	
}
