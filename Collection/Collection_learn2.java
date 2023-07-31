import java.util.HashSet;
import java.util.Scanner;
class Collection_learn2 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		HashSet<Integer> oop = new HashSet<Integer>();
		//boolean a = oop.add(10); 
		/*boolean b = oop.add(5);
		boolean c = oop.add(3);*/
		
		int x = oop.size(); // same .length
		System.out.println("Size : " + x); // kept Differance Type  
		boolean y = oop.isEmpty();
		System.out.println("Empty : " + y);
		for(;;)
		{
			System.out.print("Enter data : ");
			int n = in.nextInt();
			boolean data = oop.add(n);
			System.out.println("ADD sucess" + data);
			System.out.println("Check Empty again : " + oop.isEmpty());
			
			if(n == 3)
			{
				break;
			}
		}
		boolean r = oop.remove(10);
		System.out.println("Remove " + r );
		
	}
}
