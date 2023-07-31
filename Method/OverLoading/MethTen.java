import java.util.Scanner;
class MethTen
{
	public static void main(String[] args) 
	{
		
		MethTen oop = new MethTen(); // notify obj.
		int a = oop.getNumber();
		int b = oop.getNumber();
		int x = oop.setMain(a,b);
		
		System.out.println(l);
	}
	int getNumber()
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		return n ;
	}
	int setMain(int a,int b) // 1
	{
		int sum = a + b;
		return sum ;
	}
	
}
