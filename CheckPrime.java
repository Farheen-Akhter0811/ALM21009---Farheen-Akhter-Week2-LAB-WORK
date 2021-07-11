package week2;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		int temp;
		boolean isPrime = true;
		System.out.println("Enter a number...");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		for(int i=2;i<num/2;i++) {
			temp = num%i;
			if(temp == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("It is a Prime Number");
		}
		else {
			System.out.println("It is not Prime Number");
		}
		
		
	}

}
