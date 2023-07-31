class Continue_01 
{
	public static void main(String[] args) 
	{
		for(int i = 1 ; i <= 50 ; i++)
		{
			
			if(i%10 == 0)
			{
				System.out.println();
				continue;
			}
			System.out.print( " "+ i);
		}
		
	}
}
