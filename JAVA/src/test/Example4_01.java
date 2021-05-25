package test;

import java.util.Scanner;

public class Example4_01 {

	public static void main(String[] args) {
		int a, b = 5, c =3;
		char op;
		Scanner s = new Scanner(System.in);
		
		System.out.printf("연산자를 입력하세요 \n", c);
		op = s.next().charAt(0);
		
		if(op == '+') {
			a = b +c;
			System.out.printf("%d + %d = %d \n",b,c,a);}
	
		if(op == '-') {
			a = b -c;
			System.out.printf("%d - %d = %d \n",b,c,a);}
			
		
	}

}
