package Assisgnment1;

import java.util.Arrays;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int[] arr=new int[sc.nextInt()];
		System.out.println("Enter the elements of array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("third largest element is "+arr[arr.length-3]);
		sc.close();
	}
	

}
