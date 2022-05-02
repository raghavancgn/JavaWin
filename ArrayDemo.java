package OOPYpk;
import java.io.*;

public class ArrayDemo {
	public static void main(String[] args) {
		int i, avg, sum = 0;
		int[] marks;
		marks = new int[30];
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// store data in the array
			for(i=0; i<=29; i++) {
				System.out.println("Enter marks: ");
				marks[i] = Integer.parseInt(br.readLine());
			}

			//read data from array
			for(i=0; i<=29; i++)
				sum = sum + marks[i];
			avg = sum/30;
			System.out.println("Average marks = " + avg);
		} catch(IOException e) {
			System.out.println("Error in Input");
		}
	}
}