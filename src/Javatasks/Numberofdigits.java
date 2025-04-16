package Javatasks;
import java.util.Scanner;
public class Numberofdigits {
static int a;
static int count = 0;
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		a = sc.nextInt();
		
		while(a!=0) {
			a=a/10;
			count++;
		}
		System.out.println("The number digits in the given number is : " + count);
		}
		

	}
