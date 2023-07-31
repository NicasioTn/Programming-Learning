import java.util.ArrayList;
import java.util.Scanner;
class Collection_list
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		ArrayList<Double> oop = new ArrayList<Double>();
		oop.add(32.5);
		oop.add(7.25);
		oop.add(6.3);
		oop.add(7.5);
		oop.add(0,10.2);
		//System.out.println(oop);
		//System.out.println("Size : " + oop.size());
		for(int i = 0; i < oop.size() ; i++ )
		{
			System.out.print(i + " : ");
			double x = oop.get(i);
			System.out.println(x);
		}
		//double x = oop.get(2); // return Element
		//System.out.println(x);
		oop.set(3,90.2);
		System.out.println(oop); 
	}
}
