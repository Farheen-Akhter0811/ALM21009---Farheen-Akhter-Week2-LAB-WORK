package week2;

public class AdvancedForLoop {

	public static void main(String[] args) {
		int[] array = {10,20,30,40};
		int sum = 0;
		for(int num:array) {
			sum = sum+num;
		}
		System.out.println("The sum of number is Array using Advanced Loop is"+sum);
	}

}
