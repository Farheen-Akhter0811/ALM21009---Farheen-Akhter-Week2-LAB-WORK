package week2;

import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[10];
		int sum = 0;
		System.out.println("Enter 10 Elements..");
		for(int i=0 ; i<10 ; i++) {
			array[i] = scan.nextInt();
		}
		for(int num:array) {
			sum = sum+num;
		}
		System.out.println("The sum of numbers in array"+sum);
	}

}
