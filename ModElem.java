package OOPYpk;
public class ModElem {
	public static void main(String[] args) {
		int[] marks = {55,65,75,56,78,78,90};
		int i;
		for (i=0; i<=6; i++)
			Modify(marks[i]);
		for (i=0; i<=6; i++)
			System.out.println(marks[i]);
	}
	
	static void Modify(int m)
	{
		m = m * 2;
	}
}