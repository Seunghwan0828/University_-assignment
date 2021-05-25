package test;
import java.util.Scanner;
public class ch05_11 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int a,c;
		char b;
		System.out.print("첫번째 수를 입력하세요 : ");
		a = i.nextInt();
		System.out.print("계산할 연산자를 입력하세요 :");
		b = i.next().charAt(0);
		System.out.print("두번째 수를 입력하세요 :");
		c = i.nextInt();
		if (b == '+')
			System.out.printf("%d + %d = %d", a,c,a+c);
		if (b == '-')
			System.out.printf("%d - %d = %d", a,c,a-c);
		if (b == '*')
			System.out.printf("%d * %d = %d", a,c,a*c);
		if (b == '/')
			System.out.printf("%d / %d = %d", a,c,a/c);
	}
}
