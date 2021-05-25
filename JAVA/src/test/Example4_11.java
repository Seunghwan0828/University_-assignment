package test;

public class Example4_11 {

	public static void main(String[] args) {
		byte a = 'A',b;
		byte mask = 0x0F;
		System.out.printf("%x & %x = %x \n", a,mask,a&mask);
		System.out.printf("%x | %x = %x \n", a,mask,a|mask);
		
		mask = 'a'-'A';
		b = (byte)(a^mask);
		System.out.printf("%c & %d = %d \n", a,mask,b);
		a = (byte)(b^mask);
		System.out.printf("%c & %d = %d \n", b,mask,a);
	}

}
