package test;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, result;
		
		a=100;
		b=200;
		
		System.out.println("Honggil dong.");
		System.out.print(a);
		System.out.println(b);
		
		//System.out.println(args[0]);
		Scanner s = new Scanner(System.in);
		
		System.out.print("Input a:");
		a = s.nextInt();
		System.out.print("Input b:");
		b = s.nextInt();
		result = a + b;
		System.out.println(a+"+"+b+"="+result);
	}

}
