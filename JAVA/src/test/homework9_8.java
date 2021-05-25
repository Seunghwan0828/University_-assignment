package test;
import java.util.Scanner;

class myChar{
	char ch;
}

public class homework9_8 {

	static int diff(myChar a, myChar b) {
		if(a.ch > b.ch)
			return a.ch - b.ch;
		else
			return b.ch - a.ch;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		myChar ch1 = new myChar();
		myChar ch2 = new myChar();
		
		System.out.print("문자1을 입력 :");
		ch1.ch = s.nextLine().charAt(0);
		System.out.print("문자1을 입력 :");
		ch2.ch = s.nextLine().charAt(0);
		
		System.out.printf("두 문자의 차이 ==> %d\n", diff(ch1, ch2));
	}

}
