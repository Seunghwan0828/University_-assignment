package test;

public class java03_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "IT CookBook 입니다.";
		String str2 = "10";
		String str3 = "20";

		System.out.printf("%s \n", str1);
		
		str1 = "Java 입니다.";
		
		System.out.printf("%s \n", str1);
		System.out.printf("%s \n", str2 + str3);
		
		System.out.printf("Length : %d \n", str1.length());
		System.out.printf("0th: %c \n", str1.charAt(0));
		System.out.printf("0th: %c \n", str1.charAt(5));
		System.out.printf("0th: %c \n", str1.charAt(6));
	}

}
