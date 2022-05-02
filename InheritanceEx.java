package OOPYpk;
class Ex 
{
	public void Fun()
	{
		System.out.println("inside Ex-Fun()");
	}
	public void Save()
	{
		System.out.println("inside Ex-Save()");
	}
	public void Enc()
	{
		System.out.println("inside Ex-Enc()");
	}
	public void Open()
	{
		System.out.println("Inside Ex-Open()");
	}
}

class NewEx extends Ex
{
	public void Save()
	{
		System.out.println("inside NewEx-Save()");
	}
	public void Enc()
	{
		System.out.println("inside NewEx-Enc()");
	}
	public void AutoUpdate()
	{
		System.out.println("Inside NewEx-AutoUpdate() ");
	}
	public void Open()
	{
		System.out.println("Inside NewEx-Open()");
		super.Open();
	}
}
public class InheritanceEx {
	public static void main(String[] args) {
		NewEx e = new NewEx();
		e.Fun();
		e.Save();
		e.Enc();
		e.AutoUpdate();
		e.Open();
	}
}