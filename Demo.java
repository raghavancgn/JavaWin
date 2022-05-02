package OOPYpk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Rectangle {
	private int len, brd;
	public void GetData() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter length and breadth: ");
			len = Integer.parseInt(br.readLine());
			brd = Integer.parseInt(br.readLine());					
		}catch(IOException e) {
			System.out.println("Error in input");
		}
	}
	
	public void setData(int l, int b){
		len = l;
		brd = b;
	}
	
	public void DisplayData() {
		System.out.println("length = " +len);
		System.out.println("breadth = " +brd);
	}
	
	public void AreaPeri() {
		int a, p;
		a = len * brd;
		p = 2 * (len+brd);
		System.out.println("area = " +a);
		System.out.println("perimeter = " +p);
	}
	
 static class Demo {
	public static void main(String[] args) {
		Rectangle r1, r2, r3; // define three references
		
		r1 = new Rectangle();
		r2 = new Rectangle();
		r3 = new Rectangle();
		
		r1.setData(10, 20); // set data in elements of the object
		r1.DisplayData();   // display the data 
		r1.AreaPeri();      // calculate and print area and perimeter
		
		r2.setData(5,8); 
		r2.DisplayData();    
		r2.AreaPeri(); 
		
		r3.GetData(); 
		r3.DisplayData();    
		r3.AreaPeri(); 
	}
  }
}
