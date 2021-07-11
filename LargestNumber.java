package week2;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		System.out.println("Enter number1 ..");
		Scanner read_1 = new Scanner(System.in);
		int num1 = read_1.nextInt();
		
		System.out.println("Enter number2 ..");
		Scanner read_2 = new Scanner(System.in);
		int num2 = read_2.nextInt();
		
		System.out.println("Enter number3 ..");
		Scanner read_3 = new Scanner(System.in);
		int num3 = read_3.nextInt();
		
		
		if(num1>num2 && num1>num3) {
			System.out.println(+num1 +" "+"I am Largest among three... as checked with number 1");
		}
		else if(num2>num3 && num2>num1) {
			System.out.println(+num2 +" " +"I am the Largest among three... as checked with number 2");

		}
		else {
		System.out.println(+num3 +" "+ "I am the Largest among three.. as checked with number 3");
		}
			
	}

}
