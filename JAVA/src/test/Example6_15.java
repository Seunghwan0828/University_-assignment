package test;

public class Example6_15 {

	public static void main(String[] args) {
		int i ,k;
		for (i = 1; i <= 9; i ++) {
			for (k = 2; k <= 9; k++) {
				System.out.printf("%4d X %2d = %2d", k,i,k*i);
			}
			System.out.print("\n");
		}
	}

}
