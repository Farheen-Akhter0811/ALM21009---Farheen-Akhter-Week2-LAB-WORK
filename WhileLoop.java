package week2;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		System.out.println("Enter initial number below 10..");
		Scanner read = new Scanner(System.in);
		int number = read.nextInt();
		int sum = 0;
		
				while(number<=10) {
					sum =sum+number;
					number++;
				}
		System.out.format("The sum of number is %d", sum);

	}

}
