package test;

import java.util.Scanner;

public class Example3_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		int i;
		
		System.out.print("문자열을 입력 ==>");
		str = s.nextLine();
		
	for(i = str.length() -1; i >=0; i--){
		if(str.charAt(i) != 'o')
			System.out.printf("%c", str.charAt(i));
	}
	System.out.printf("\n");
	}

}
