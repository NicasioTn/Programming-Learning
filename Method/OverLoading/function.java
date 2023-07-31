class funcTion
{
	public static void main(String[] args) 
	{
		
		funcTion oop = new funcTion();
		int a = oop.Fact(5);
		System.out.println(a);
	}
	int Fact(int n)
	{
		if(n == 0) // base case
		{
			return 1;
		}
		else // recursive case
		{
			return n*Fact(n-1);
		}
	}
}
