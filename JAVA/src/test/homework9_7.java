package test;
import java.util.Scanner;

public class homework9_7 {

	static int diff(char a, char b) {
		if(a > b)
			return a - b;
		else
			return b - a;
	}
	
	public static void main(String[] args) {
		char a,b;
		int i;
		Scanner s = new Scanner(System.in);
		
		System.out.print("문자1을 입력: ");
		a = s.nextLine().charAt(0);
		System.out.print("문자2을 입력: ");
		b = s.nextLine().charAt(0);
		
		System.out.printf("두 문자의 차이 ==> %d \n", diff(a,b));
	}

}
