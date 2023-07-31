import java.util.Scanner ; 
class MethOOP 
{
	public static void main(String[] args) 
	{
		MethOOP oop = new MethOOP();
		int num = oop.getNum();
		String key = oop.primeNumber(num);

		System.out.println(num + " " + key);
	}
	int getNum()
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		return a; 
	}
	String primeNumber(int num )
	{
		int j = 0;
		String word = " " ;
		for(int i = 1 ; i <= num; i++)
		{
			if(num % i == 0)
			j++ ;
		}
		if(j == 2 )
		{
			word = " is PrimeNumber " ;
		}
		else
		{
			word = "is Not PrimeNumber " ; 
		}
		return word ; 
	}
}
