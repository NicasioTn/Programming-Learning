class Sleep_01
{
	public static void main(String[] args) 
	{
		for(int x = 1;;x++)
		{
			try
			{
				Thread.sleep(60); // 1000 = 1 second 
				
			}
			catch (InterruptedException ex){}
			{
				System.out.print("\r" +x);
			}

		}
	}	
	
}