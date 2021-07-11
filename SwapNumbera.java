package week2;

public class SwapNumbera {

	public static void main(String[] args) {
		int first = 100,second=200;
		System.out.println("The value of First Number Before Swap is..."+first);
		System.out.println("The Value of Second Number Before Swap  is...."+second);
		int temp;
		temp = first;
		first = second;
		System.out.println("The value of First Number after Swap is..."+first);
		second = temp;
		System.out.println("The Value of Second Number after Swap  is...."+second);
				
	}

}
