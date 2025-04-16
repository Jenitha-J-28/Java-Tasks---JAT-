package Javatasks;
import java.util.Scanner;
public class GreaterThan {
	static int a;
	static int b;
	static int c;
	static int d;
	public static void main(String[] args) {
		System.out.println("Enter the value of a : ");
		Scanner sc=new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("Enter the value of b : ");
		b = sc.nextInt();
		System.out.println("Enter the value of c : ");
		c = sc.nextInt();
		System.out.println("Enter the value of d : ");
		d = sc.nextInt();
	if((a+b)>(c+d)) 
	{
		System.out.println("The sum of a and b is greater then the sum of c and d");
	
	}
	}

}
