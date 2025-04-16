package Javatasks;

import java.util.Scanner;

public class Factorial {
static int a;
	public static void main(String[] args) {
		System.out.println("Enter the value of a : ");
		Scanner sc=new Scanner(System.in);
		a = sc.nextInt();
		int fact = 1;
		for(int i=1; i<=a; i++)
		{ 
			fact = fact*i;
		
		}
		System.out.println("The factorial of the given number is : " + fact);

	}

}
