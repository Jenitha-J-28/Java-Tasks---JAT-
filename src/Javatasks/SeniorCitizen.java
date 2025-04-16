package Javatasks;

import java.util.Scanner;

public class SeniorCitizen {
static int age;
	public static void main(String[] args) {
		System.out.println("Enter the age : ");
		Scanner sc=new Scanner(System.in);
		age = sc.nextInt();
	if (age>=60) {
		System.out.println("The person is Senior Citizen");
	}else {
		System.out.println("The person is not a Senior Citizen");
			}
	}

	}