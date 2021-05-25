package test;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		int data;
		System.out.printf("16진수를 입력하세요: ");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		data = Integer.parseInt(str, 16);
		System.out.printf("입력한 16진수는 10 진수로 %d 입니다.", data);
	}

}
