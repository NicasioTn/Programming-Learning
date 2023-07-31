import java.io.File;

class practice_File9 
{
	public static void main(String[] args) 
	{
		String file = "D:\\xxx\\gm\\test.txt";
		// referece location file 
		File fl = new File(file);
		boolean ex = fl.exists();
		System.out.println(ex);
		// get path from fl 
		// fl is obj of file
		File x = fl.getAbsoluteFile(); 
		// same on itself
		String path = fl.getAbsolutePath();
		// length of Character
		long op = fl.length(); 
		// path of Parent file
		String k = fl.getParent();
		
		System.out.println(k);
	}
}
