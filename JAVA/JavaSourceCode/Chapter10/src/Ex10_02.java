public class Ex10_02 {
	public static void main(String[] args) {
		int[] aa = new int[3];
		try {
			aa[2] = 100 / 0;
			aa[3] = 100;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ÷�ڰ� �迭 ũ�⺸�� Ŀ�� ~~");
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ ���� �������� ~~");
		} finally {
			System.out.println("�� �κ��� ������ ���Ϳ� ~~");
		}
	}
}