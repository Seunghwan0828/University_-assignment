package test;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class homework28 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("/Volumes/WD_1TB/Study_Assinment/JAVA/in.txt"));
		PrintWriter pw = new PrintWriter("/Volumes/WD_1TB/Study_Assinment/JAVA/out.txt");

		String str1, str2 = "";

		while (sc.hasNextLine()) {
			str1 = sc.nextLine();
			int size = str1.length();
			for (int i = size - 1; i >= 0; i--)
				str2 += str1.charAt(i);

			pw.println(str2);
			str2 = "";
		}

		sc.close();
		pw.close();
	}
}
