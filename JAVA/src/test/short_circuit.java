package test;

public class short_circuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20, c=30;
		if((a > b) && (a < ++c))
			System.out.printf("True: %d, %d, %d\n", a, b, c);
		else
			System.out.printf("False: %d, %d, %d\n", a, b, c);
		if((a < b) && (a < ++c))
			System.out.printf("True: %d, %d, %d\n", a, b, c);
	}

}
