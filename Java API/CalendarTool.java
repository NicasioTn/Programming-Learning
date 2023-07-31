import java.util.Calendar;
class CalendarTool 
{
	public static void main(String[] args) 
	{
		Calendar mo = Calendar.getInstance();
		//System.out.println(mo);
		int a = mo.get(Calendar.DAY_OF_WEEK);
		System.out.println(a);
	}
}
