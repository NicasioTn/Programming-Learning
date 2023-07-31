import java.util.Set;
import java.util.HashMap;
class Collection_Map 
{
	public static void main(String[] args) 
	{
		//HashMap oop = new HashMap();
		HashMap<Integer,String> oop = new HashMap<Integer,String>();
		oop.put(0,"Peter"); // oop.put('A',10); oop.put("GOD",12.4);
		String a = oop.put(1,"P");
		String b = oop.put(2,"e"); 
		String c = oop.put(3,"ter");
		oop.size();
		System.out.println("Size : " + oop.size());
		System.out.println(oop);
		System.out.println(a);
		/*for(int i = 0 ;i < oop.size() ; i++)
		{
			//System.out.print(oop.get(i));  // .get(key)
		}
		System.out.println();*/
		Set ee = oop.keySet(); 
		System.out.println(ee);
	}
}
