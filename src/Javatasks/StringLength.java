package Javatasks;

import java.util.Scanner;

public class StringLength {
static String msg;
	public static void main(String[] args) {
		System.out.println("Enter the message: ");
		Scanner sc=new Scanner(System.in);
		msg = sc.nextLine();
		//int Length = msg.length(); can assign the length to another variable and can print it.
		
		System.out.println("The length of the given message is : " + msg.length());
	}

}
