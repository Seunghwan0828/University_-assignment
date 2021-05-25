package test;
import java.util.Scanner;

class Char{
	char ch;
}

public class homework9_9 {

	static void swap(Char a, Char b) {
		char imsi;
		
		imsi = a.ch;
		a.ch = b.ch;
		b.ch = imsi;
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Char ch1 = new Char();
		Char ch2 = new Char();
		
		System.out.print("문자1을 입력 :");
		ch1.ch = s.nextLine().charAt(0);
		System.out.print("문자2을 입력 :");
		ch2.ch = s.nextLine().charAt(0);
		
		swap(ch1, ch2);
		
		System.out.printf("바뀐문자 ==> %c %c", ch1.ch, ch2.ch);
	}

}
