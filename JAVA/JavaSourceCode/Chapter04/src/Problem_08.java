import java.util.Scanner;

public class Problem_08 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		float a, b;
		float result;

		System.out.printf("ù��° ����� ���� �Է��ϼ��� ==> ");
		a = s.nextFloat();
		System.out.printf("�ι�° ����� ���� �Է��ϼ��� ==> ");
		b = s.nextFloat();

		result = a + b;
		System.out.printf(" %5.2f + %5.2f = %5.2f \n", a, b, result);
		result = a - b;
		System.out.printf(" %5.2f - %5.2f = %5.2f \n", a, b, result);
		result = a * b;
		System.out.printf(" %5.2f * %5.2f = %5.2f \n", a, b, result);
		result = a / b;
		System.out.printf(" %5.2f / %5.2f = %5.2f \n", a, b, result);
		result = (int) a % (int) b;
		System.out.printf(" %d %% %d = %d \n", (int) a, (int) b, (int) result);
		
		s.close();
	}
}