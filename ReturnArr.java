package OOPYpk;

public class ReturnArr {
	public static void main(String[] args) {
		int[] p;
		p = Func();
		for (int i=0; i<=p.length-1; i++)
			System.out.print(p[i] + " ");
	}
	
	static int[] Func()
	{
		int[] arr = {10,20,30,40,50};
		return arr;
	}
}