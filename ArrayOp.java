package OOPYpk;
import java.util.*;
public class ArrayOp {
	public static void main(String[] args) {
		int[] arr = {23,45,15,11,89,54,32};
		int i;
		
		System.out.println("Original Array");
		for(i=0; i<arr.length; i++)
			System.out.println(arr[i] + " ");
		
		Arrays.sort(arr);
		System.out.println("\n The sorted Array is: ");
		for(i=0; i<arr.length; i++)
			System.out.println(arr[i] + " ");
		
		int index = Arrays.binarySearch(arr, 54);
		System.out.println("\nElement 54 is at : " + index);
		
		int[] newarr = new int[6];
		newarr = Arrays.copyOf(arr,  arr.length);
		System.out.println("New array contents");
		for(i=0; i<newarr.length; i++)
			System.out.println(newarr[i] + " ");
		Arrays.fill(arr, 0);
		System.out.println("\nCleared Array..");
		for(i=0; i<arr.length; i++)
			System.out.println(arr[i] + " ");
		System.out.println();
	}
}