package test;
import java.util.Scanner;

public class ch03_04 {

	public static void main(String[] args) {
		int a;
		System.out.print("정수를 입력하세요 ===> ");
		Scanner n = new Scanner(System.in);
		a = n.nextInt();
		System.out.printf("10진수 ===> %d\n", a);
		System.out.printf("16진수 ===> %x\n", a);
		System.out.printf("8진수 ===> %o\n", a);
	}

}
