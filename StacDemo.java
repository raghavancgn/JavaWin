package OOPYpk;
//base class
class Stack
{
	protected int MAX = 25;
	protected int[] s;
	protected int Top;
	public Stack()
	{
		s = new int[MAX];
		Top = -1;
	}
	
	public void Push(int num)
	{
		Top++;
		s[Top] = num;
	}
	
	public int Pop()
	{
		int num;
		num = s[Top];
		Top--;
		return(num);
	}
}

//derived class
class Stack1 extends Stack
{
	public void Push(int num)
	{
		if (Top ==  MAX-1)
			System.out.println("Stack is Full..");
		else
			super.Push(num); //calls Push() of base class
	}
	
	public int Pop()
	{
		int n;
		if (Top==-1)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
		{
			n = super.Pop(); //calls Pop() of base class
			return(n);
		}
	}
}
public class StacDemo {

	public static void main(String[] args) {
		int n;
		Stack1 stk;
		
		stk = new Stack1();
		stk.Push(10);
		stk.Push(20);
		stk.Push(30);
		
		n = stk.Pop();
		System.out.println(n);
		
		n= stk.Pop();
		System.out.println(n);
	}
}