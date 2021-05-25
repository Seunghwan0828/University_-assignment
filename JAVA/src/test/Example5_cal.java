package test;

import java.util.Scanner;

public class Example5_cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b;
		char ch;
		String str;
		//String[] str;
		
		System.out.printf("수식을 한줄로 띄어쓰기로 입력하새요 :" );
		/*str = s.nextLine().split(" ");
		
		a = Integer.parseInt(str[0]);
		ch = str[1].charAt(0);
		b = Integer.parseInt(str[2]);
		*/
		str = s.nextLine();
		
		a = Integer.parseInt(Character.toString(str.charAt(0)));
		ch = str.charAt(1);
		b = Integer.parseInt(Character.toString(str.charAt(2)));
		
		switch (ch) {
		case '+':
			System.out.printf("%d + %d = %d\n", a, b, a+b);
			break;
		case '-':
			System.out.printf("%d - %d = %d\n", a, b, a-b);
			}
	}

}
