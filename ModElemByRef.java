package OOPYpk;
public class ModElemByRef {
	public static void main(String[] args) {
		int[] marks = {55,65,75,56,78,78,90};
		int i;
		
		Modify(marks);
		
		for (i=0; i<=marks.length-1; i++)
			System.out.println(marks[i] + "");
	}
	
	static void Modify(int[] m)
	{
		int i;
		for(i=0; i<=m.length-1; i++)
		m[i] = m[i] * 2;
	}
}
