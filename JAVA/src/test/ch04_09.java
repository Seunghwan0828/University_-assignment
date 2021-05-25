package test;
import java.util.Scanner;
public class ch04_09 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int a,result,result1;
		System.out.print("## 교환할 돈은? ");
		a = i.nextInt();
		result = a/500;
		result1 = a%500;
		System.out.printf("오백원짜리 ==> %d개\n", result);

		result = result1/100;
		result1 = result1%100;
		System.out.printf("백원짜리 ==> %d개\n", result);

		result = result1/50;
		result1 = result1%50;
		System.out.printf("오십원짜리 ==> %d개\n", result);

		result = result1/10;
		result1 = result1%10;
		System.out.printf("십원짜리 ==> %d개\n", result);
		System.out.printf("바꾸지못한 잔돈 ==> %d원\n", result1);
	}

}
