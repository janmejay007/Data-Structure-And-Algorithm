
//1. Write a Java program to find the index of an array element.
package Assisgnment1;

import java.util.Scanner;

public class Program1 {
	
	public static int findIndex(int[] arr,int number) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==number) {
				return i;
			}
			
		}
		return -1;
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int[] arr=new int[sc.nextInt()];
		System.out.println("Enter the elements of array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the element whose index you want to search");
		int index=findIndex(arr, sc.nextInt());
		
		System.out.println("Index of givent number is "+index);
		
		sc.close();
	}

}
