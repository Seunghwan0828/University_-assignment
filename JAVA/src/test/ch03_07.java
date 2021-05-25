package test;
import java.util.Scanner;

public class ch03_07 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		String s;
		int i;
		s = n.nextLine();
		for(i = s.length()-1 ; i >= 0 ; i--) {
			System.out.printf("%c",s.charAt(i));
		}
	}

}
