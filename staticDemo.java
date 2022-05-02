package OOPYpk;
// Usage of static constructor
import java.util.*;

class Sample {
	public static int y;
	public static int m;
	public static int d;
	
	//static constructor
	static
	{
		Calendar cal = Calendar.getInstance();
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH);
		d = cal.get(Calendar.DAY_OF_MONTH);
	}
	
	public static void ShowDate() {
		System.out.println("Year " + y);
		System.out.println("Month " + m);
		System.out.println("Day " + d);
	}
}

public class staticDemo {
	public static void main(String[] args) {
		Sample.ShowDate();
	}
}