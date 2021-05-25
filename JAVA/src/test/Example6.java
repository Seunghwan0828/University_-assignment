package test;

import java.util.Random;
import java.util.Scanner;


public class Example6 {

	public static void main(String[] args) {
		int com, user;
		Scanner in = new Scanner(System.in);
		
		Random rnd = new Random();
		com = rnd.nextInt(6)+1;
		System.out.print("수 = ");
		user = in.nextInt();
		if (com == user)
			System.out.println("일치함"+com+','+user);
		else
			System.out.println("불일치"+com+','+user);
		
		}
	}
