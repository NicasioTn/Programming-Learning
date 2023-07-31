import java.util.Scanner;
class CompareSRing
{
	public static void main(String[] args)
	{
	String name, text = " " ;
	Scanner in = new Scanner(System.in);
	name = in.nextLine();
	String x = " ";
	x = in.nextLine();
	if(name.equals(x))
	{
		System.out.println(name + " == " + x);
	}
	else 
	{
		System.out.println(name + " != " + x );
	}
	//System.out.println(text);
	}
}