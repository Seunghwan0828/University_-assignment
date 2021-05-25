package test;
import java.util.Scanner;
public class ch05_13 {

	public static void main(String[] args) {
		int a,b;
		char c;
		String[] s;
		Scanner i = new Scanner(System.in);
		System.out.print("수식을 한줄로 띄어쓰기로 입력하세요 : ");
		s = i.nextLine().split(" ");
		a = Integer.parseInt(s[0]);
		c = s[1].charAt(0);
		b = Integer.parseInt(s[2]);
		switch(c) {
		case '+':
			System.out.printf("%d + %d = %d", a,b,a+b); break;
		case '-':
			System.out.printf("%d - %d = %d", a,b,a-b); break;
		case '*':
			System.out.printf("%d * %d = %d", a,b,a*b); break;
		case '/':
			System.out.printf("%d / %d = %d", a,b,a/b); break;
		case '%':
			System.out.printf("%d %% %d = %d", a,b,a%b); break;
		}
	}

}
