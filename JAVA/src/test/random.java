package test;

import java.util.Scanner;
import java.util.Random;

public class random {

	public static void main(String[] args) {
		int i, num, random;
		Random rnd = new Random();
		random = rnd.nextInt(6)+1;
		for(i=0; i < random; i++)
		{
			System.out.print("*");
		}
		System.out.print("\n몇개일까요? ");
		Scanner n = new Scanner(System.in);
		num = n.nextInt();
		if(num == i)
			System.out.print("맞았습니다.");
		else
			System.out.print("틀렸습니다.");
	}

}
