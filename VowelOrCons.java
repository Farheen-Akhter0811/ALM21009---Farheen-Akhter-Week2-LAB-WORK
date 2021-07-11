package week2;

import java.util.Scanner;

public class VowelOrCons {

	public static void main(String[] args) {
		System.out.println("Enter the Alphabet you like to check if Vowel or Consonant...");
		Scanner read = new Scanner(System.in);
		char ch = read.next().charAt(0);
		if(ch == 'a'|| ch == 'e'||ch == 'i'|| ch == 'o'||ch == 'u') {
			System.out.println("Its Vowel...."+ch);
		}
		System.out.println("Its Consonant...."+ch);

	}

}
