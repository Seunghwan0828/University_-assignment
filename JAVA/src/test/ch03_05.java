package test;
import java.util.Scanner;

public class ch03_05 {

	public static void main(String[] args) {
		int a,c;
		String b;
		Scanner n = new Scanner(System.in);
		System.out.print("입력진수 결정 <1>10 <2>16 <3>8 : ");
		a = n.nextInt();
		System.out.print("값 입력 : ");
		b = n.next();
		if(a == 1) {
			c =Integer.parseInt(b, 10);
			System.out.printf("10진수 ==> %d\n", c);
			System.out.printf("16진수 ==> %x\n", c);
			System.out.printf("8진수 ==> %o\n", c);
		}
		else if(a == 2) {
			c =Integer.parseInt(b, 16);
			System.out.printf("10진수 ==> %d\n", c);
			System.out.printf("10진수 ==> %x\n", c);
			System.out.printf("10진수 ==> %o\n", c);
		}
		else if(a == 3) {
			c =Integer.parseInt(b, 8);
			System.out.printf("10진수 ==> %d\n", c);
			System.out.printf("10진수 ==> %x\n", c);
			System.out.printf("10진수 ==> %o\n", c);
		}
	}

}
