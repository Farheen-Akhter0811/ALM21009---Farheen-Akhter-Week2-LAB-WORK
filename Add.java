package week2;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		//Using Static Values
		int i = 10;
		int j = 20;
		int sum = i+j;
		System.out.println("The sum of two numbers is...."+sum);
		
		//Using Values from Keyboard
		System.out.println("Enter a value");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		System.out.println("Enter b value");
		Scanner scan1 = new Scanner(System.in);
		int b = scan1.nextInt();
		
		int add = a + b ;
		System.out.println("The addition of numbers is..."+add);
	}

}
