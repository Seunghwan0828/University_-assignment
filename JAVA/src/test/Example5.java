package test;
import java.util.Scanner;
public class Example5 {

	public static void main(String[] args) {
		int f;
	      System.out.println("숫자를 입력하세요.");
	      Scanner s = new Scanner(System.in);
	      f = s.nextInt();
	      
	      int bit0, bit1, bit2, bit3;
	      
	      bit0 = f & 0x01;
	      bit1 = (f >> 1) & 0x01;
	      bit2 = (f >> 2) & 0x01;
	      bit3 = (f >> 3) & 0x01;
	      
	      System.out.printf("16진수로 바꾼 결과는 %d%d%d%d 입니다.", bit3, bit2, bit1, bit0);

	}

}
