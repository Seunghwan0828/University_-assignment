package test;

import java.io.IOException;
import java.util.Scanner;

public class Example_07_4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b;
		char ch;
		
		while(true) {
			System.out.print("계산할 첫번째 수를 입력: ");
			a = s.nextInt();
			System.out.print("계산할 번째 수를 입력: ");
			b = s.nextInt();
			System.out.print("계산할 연산자를 입력하세: ");
			ch = (char)System.in.read();
			
			switch(ch) {
			case '+':
				System.out.printf("%d + %d = %d 입니다.\n",a ,b, a+b); break;
			case '-':
				System.out.printf("%d - %d = %d 입니다.\n",a ,b, a-b); break;
			case '*':
				System.out.printf("%d * %d = %d 입니다.\n",a ,b, a*b); break;
			case '/':
				System.out.printf("%d / %d = %d 입니다.\n",a ,b, a/b); break;
			case '%':
				System.out.printf("%d % %d = %d 입니다.\n",a ,b, a%b); break;
			default:
				System.out.print("연산자를 잘못 입력했습니다.\n");
			}
		}
	}

}
