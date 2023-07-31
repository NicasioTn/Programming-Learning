import java.util.HashSet;
class Collection_learn 
{
	public static void main(String[] args) 
	{
		HashSet oop = new HashSet();
		boolean a = oop.add(10); // keep in Element type
		boolean b = oop.add(10.6);
		boolean c = oop.add('A');
		boolean d = oop.add("sunday");
		boolean e = oop.add(10); // add not again data by 10 Added
		int x = oop.size(); // same .length
		System.out.println("Size : " + x); // kept Differance Type  
		boolean y = oop.isEmpty();
		System.out.println(y);
		System.out.println(e);
		
	}
}
