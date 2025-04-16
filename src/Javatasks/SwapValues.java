package Javatasks;

import java.util.Scanner;

public class SwapValues {
static int a;
static int b;
static int c;
	public static void main(String[] args) {
	System.out.println("Enter the value of a: ");
	Scanner sc=new Scanner(System.in);
	a = sc.nextInt();
	System.out.println("Enter the value of b: ");
	b = sc.nextInt();
	
	System.out.println("The value of a and b before Swapping: a = "+ a + " and b = " +b );
	c = a;
	a = b;
	b = c;
	System.out.println("The swapped values of a and b : a = "+ a + " and b = " +b );
	
	}

}
