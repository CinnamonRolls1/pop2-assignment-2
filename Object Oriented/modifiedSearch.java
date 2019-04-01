import java.io.*;
import java.util.*;
import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}

public class modifiedSearch{
	public static int linearSearch(Node head,int key){
		Node t = head;
		int test = -1,count = 0;
		while(t!=null){
			if(t.data == key){
				test = count;
				break;
			}
			count++;
			t = t.next;
		}
		return test;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of elements: ");
		int n = sc.nextInt();
		System.out.println("Please enter the Linked List elements: ");
		Node head = new Node(sc.nextInt());
		for(int i=0;i<n-1;i++){
			Node y = head;
			while(y.next!=null){
				y = y.next;
			}
			Node x = new Node(sc.nextInt());
			y.next = x;
		}
		System.out.println("Please enter the element to be searched(Key): ");
		int key = sc.nextInt();
		int res = linearSearch(head,key);
		if(res != -1){
			System.out.println("Element found at index: " + Integer.toString(res));
		}
		else{
			System.out.println("Element not found!");
		}
	}
}