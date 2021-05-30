package test;

class Pet{
	int age;
	
	public void move() {
		System.out.println("애완동물이 움직입니다.");
	}
}

class Dog extends Pet{
	String name;
	int weight;
	
	int getWeight() {
		return weight;
	}
}

class Bird extends Pet{
	String type;
	boolean flightYN;
	
	boolean getFlight() {
		return flightYN;
	}
}

public class homework32 {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.age = 25;
		dog1.name = "누렁이";
		dog1.weight = 10;
		
		Bird bird1 = new Bird();
		bird1.age = 5;
		bird1.type = "앵무새";
		bird1.flightYN = true;
		
		dog1.move();
		bird1.move();
		
		System.out.println("강아지의 이름은 " + dog1.name + "고, 몸무게는 " + dog1.getWeight() + "Kg입니다.");
		System.out.println("새의 종류는 " + bird1.type + "고, 날 수 " + (bird1.getFlight() ? "있" : "없") + "습니다.");
	}

}
