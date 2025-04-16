package Javatasks;
import java.util.Scanner;
public class PrimeNumber {
static int a;
	public static void main(String[] args) {
		System.out.println("Enter the value of a : ");
		Scanner sc =new Scanner(System.in);
		a = sc.nextInt();
			
		 if (isPrime(a)) {
	            System.out.println(a + " is a prime number.");
	        } else {
	            System.out.println(a + " is not a prime number.");
	        }
	    }

	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        } else {
	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
	}