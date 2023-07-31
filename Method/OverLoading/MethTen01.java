import java.util.Scanner;
class MethTen01
{
	public static void main(String[] args) 
	{
		
		MethTen01 oop = new MethTen01(); // notify obj.
		String ID = oop.code("Hello",68.123);
		double money = oop.code(68.123);
		System.out.println(ID);
		System.out.println(money);
	}
	String code(String word, double number) // Method OverLoading
	{
		String sumCode = word + ", " + number;	
		return sumCode ;
	}
	double code(double number)
	{
		double sum = number ;
		return sum ;
	}
	
}
