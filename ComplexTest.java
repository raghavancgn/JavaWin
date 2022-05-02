package OOPYpk;
import java.io.*;

class Complex {
	private float real, imag;
	public Complex() {
		
	}
	
	public Complex(float r, float i) {
		real = r;
		imag = i;
	}
	
	public void GetData() {
		float r, i;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Real and Imaginary part..");
			r = Float.parseFloat(br.readLine());
			i = Float.parseFloat(br.readLine());
			real = r;
			imag = i;
		}catch (IOException e) {
			System.out.println("Error in Input..");
		}
	  }
	public void SetData(float r,float i) {
		float real = r;
		float imag = i;
	}
	
	public void DisplayData() {
		System.out.println("real = " + real);
		System.out.println("imaginary = " + imag);
	}
	
	public Complex AddComplex(Complex y)
	{
		Complex t;
		t = new Complex();
		t.real = real + y.real;
		t.imag = imag + y.imag;
		return t;
	}
	
	public Complex MulComplex (Complex y) {
		Complex t;
		t = new Complex();
		t.real = real * y.real - imag * y.imag;
		t.imag = real *y.imag + y.real * y.imag;
		return t;
	}
}
public class ComplexTest {
	public static void main(String[] args) {
		Complex c1, c2, c3;
		c1 = new Complex();
		c1.SetData(2.0f, 2.0f);
		c2 = new Complex();
		c3 = new Complex();
		c3 = c1.AddComplex(c2);
		System.out.println("Complex c3: ");
		c3.DisplayData();
		
		Complex c4, c5, c6;
		c4 = new Complex();
		c4.GetData();
		c5 = new Complex(2.5f, 3.0f);
		c6 = new Complex();
		c6 = c4.MulComplex(c5);
		System.out.println("Complex c6: ");
		c6.DisplayData();
		
		Complex c7;
		c7 = new Complex();
		c7= c1.AddComplex(c2.MulComplex(c3));
		System.out.println("Complex c7: ");
		c7.DisplayData();

	}
}