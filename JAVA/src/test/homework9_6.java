package test;

class myInt{
	int a;
}

public class homework9_6 {

	static void func(myInt m) {
		m.a = m.a + 10;
	}
	public static void main(String[] args) {
		myInt m = new myInt();
		m.a = 100;
		
		func(m);
		System.out.printf("%d", m.a);
	}

}
