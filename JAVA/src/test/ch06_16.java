package test;
import java.util.Scanner;
public class ch06_16 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int i;
		String s;
		System.out.print("글자를 입력 : ");
		s = k.nextLine();
		for(i =s.length()-1; i>=0 ; i--) {
			System.out.printf("%c",s.charAt(i));
		}
	}

}
