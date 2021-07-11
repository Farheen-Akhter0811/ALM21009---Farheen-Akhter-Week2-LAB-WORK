package week2;

public class NestedSwitchCase {

	public static void main(String[] args) {
		String s = "Hello";
		int x = 1;
		switch(s) {
		case "Hi":
			System.out.println("I am String Hi!");
			break;
		case "Hello":
			System.out.println("I am String Hello!");
			switch(x) {
			case 1:
				System.out.println("I am Nested Switch case with x as value 1");
				break;
			case 2:
				System.out.println("I am Nested Switch case with x as value 2");
				}
			break;
		default:
			System.out.println("I am default..");
			}
		}
	}

