package week2;

import java.util.Scanner;

public class CompQuoRemainder {

	public static void main(String[] args) {
		int dividend = 25,divisor=5;
		System.out.println("The Quotient is..."+dividend/divisor);
		System.out.println("The Remainder is..."+dividend%divisor);
	}

}

class OddEven{
	public static void main(String[] args) {
		int number;
		System.out.println("Enter the number to find if its even or odd...");
		Scanner read = new Scanner(System.in);
		number = read.nextInt();
		String result = number%2 == 0 ? "Even Number...":"Odd Number...";
		System.out.println(result+"...."+number);
	
	}

}