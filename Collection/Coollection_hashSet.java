import java.util.HashSet;
import java.util.Iterator;
class Coollection_hashSet 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> oop = new HashSet<Integer>();
		/*boolean a = oop.add(10); // keep in Element type
		boolean b = oop.add(10.6);
		boolean c = oop.add('A');
		boolean d = oop.add("sunday");
		boolean e = oop.add(10); // add not again data by 10 Added*/
		oop.add(25);	oop.add(35);	oop.add(18);	oop.add(60);
		int x = oop.size(); // same .length
		System.out.println("Size : " + x); // kept Differance Type  
		//boolean y = oop.isEmpty();
		//System.out.println(y);
		//System.out.println(e);
		
		//Iterator itt = oop.iterator(); // would cast
		Iterator<Integer> itt = oop.iterator(); // Do not cast 
		
		for(int i = 0 ;i < oop.size(); i++)
		{
			//int e = (int)(itt.next()); // itt is object of Irerator class from import
			int e = itt.next();
			System.out.println(e);
		}
		
	}
}
