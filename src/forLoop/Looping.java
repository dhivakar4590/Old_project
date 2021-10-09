package forLoop;
//Day 4 Question 9
public class Looping {
	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
