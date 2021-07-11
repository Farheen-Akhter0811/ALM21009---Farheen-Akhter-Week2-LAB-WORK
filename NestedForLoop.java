package week2;

public class NestedForLoop {

	public static void main(String[] args) {
		int j;
		for(int i = 0;i<5;i++) {
			for( j = 0;j<5;j++) {
				System.out.println(+i +"..........."+j);
			}
			System.out.println(+i+"..." +j);
		}
	}

}
