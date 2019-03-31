// Implementation of linear search in Java.

import java.io.*; 
import java.util.*;
import java.util.Scanner; 

public class search{
	public static int searchKey(int[] arr,int key,int n){
		int test = -1;
		for(int i=0;i<n;i++){
			if(arr[i] == key)
				test = i;
		}
		return test;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Please enter the elements: ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Please enter the element to be searched(key): ");
		int key = sc.nextInt();
		int test = searchKey(arr,key,n);
		if(test != -1)
			System.out.println("Key found at index: " + Integer.toString(test));
		else
			System.out.println("Key not found!");
	}
}