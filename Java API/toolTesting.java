class toolTesting 
{
	public static void main(String[] args) 
	{
		String str = "101";
		int num = 2;
		//int re = Integer.parseInt(str,num); // change String to Int
		/*System.out.println(str);
		System.out.println(re); */ 
		String b2 = Integer.toBinaryString(7); 
		//int put base 10 convert (String)binary number
		System.out.println(b2);
		String b16 = Integer.toHexString(3);
		String b8 = Integer.toOctalString(3);
		System.out.println(b16 + "\n" + b8);
	}
	
}
