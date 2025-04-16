package Javatasks;
import java.util.Scanner;
public class Multiprint {
static String msg;
	public static void main(String[] args) {
		System.out.println("Enter the Message to be printed 10 times : ");
		Scanner sc=new Scanner(System.in);
		msg = sc.nextLine();
		int i =1;
		
		System.out.println("Output : ");
		for (i=1; i<=10; i++) {
		
			System.out.println(msg); 
		
		}
	}

}
