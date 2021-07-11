package week2;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input 1...");
		int input_1 = scan.nextInt();
		System.out.println("The User Entered Input is..."+input_1);
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the input 2...");
		int input_2 = scan.nextInt();
		System.out.println("The User Entered Input is..."+input_2);
		
		int mul = input_1 * input_2;
		
		System.out.println("The Multiplication of inputs is "+mul);


	}

}
