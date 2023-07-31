//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.text.DecimalFormat;
class TextTool 
{
	public static void main(String[] args) 
	{
		/*String str = "EEE u MMM yyy aaa";
		Date day = new Date();
		SimpleDateFormat oop = new SimpleDateFormat(str);
		String a = oop.format(day);
		System.out.println(a);*/
		String str = "###.##"; // set dot of number
		String str2 = "##,##.000";
		double d = 1015216561.23154;
		DecimalFormat dcm1 = new DecimalFormat(str);
		DecimalFormat dcm2 = new DecimalFormat(str2);
		String x = dcm1.format(d);
		System.out.println(x);
		String y = dcm2.format(d);
		System.out.println(y);	

		
	}
}
