package test;
import java.util.Scanner;
public class ch04_08 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		float a,b;
		System.out.print("첫번째 계산할 값을 입력하세요 ==> ");
		a = i.nextFloat();
		System.out.print("두번째 계산할 값을 입력하세요 ==> ");
		b = i.nextFloat();
		System.out.printf("%.2f + %.2f = %.2f\n", a,b,a+b);
		System.out.printf("%.2f - %.2f = %.2f\n", a,b,a-b);
		System.out.printf("%.2f * %.2f = %.2f\n", a,b,a*b);
		System.out.printf("%.2f / %.2f = %.2f\n", a,b,a/b);
		System.out.printf("%d %% %d = %d\n", (int)a,(int)b,(int)a % (int)b);
	}
}
