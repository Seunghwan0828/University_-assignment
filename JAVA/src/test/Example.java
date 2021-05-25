package test;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
	    System.out.println("숫자를 입력하세요.");
	    Scanner s = new Scanner(System.in);
	    int number;
	    number = s.nextInt();
	      
	    if (number % 2 == 0) 
	    	System.out.println("짝");
	    else
	    	System.out.println("홀");
	}

}