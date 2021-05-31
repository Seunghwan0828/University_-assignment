package test;

class Pet{
	int age;
	String color;	// Dog와 Bird 모두 색상을 가지고 있기때문에 상위클래스에 color 필드 생성
	
	int getAge() {		// age를 받아올수있는 메소드 생성
		return age;
	}
	String getColor() {		// color을 받아올수있는 메소드 생성
		return color;
	}
}

class Dog extends Pet{
	String name;
	int speed;	// 강아지의 속도 인스턴스 변수 생성
	int weight;
	static private int dogcount = 0;	// 클래스 변수를 생성하여 강아지 숫자 count
	
	int getWeight() {
		return weight;
	}
	int getSpeed() {	// 스피드를 받아오는 인스턴스 메소드 생성
		return speed;
	}
	Dog(){		// 생성자에서 dogcount를 1씩 증가시킨다
		setDogcount(getDogcount() + 1);
	}
	public static int getDogcount() {
		return dogcount;
	}
	public static void setDogcount(int dogcount) {
		Dog.dogcount = dogcount;
	}
}

class Bird extends Pet{
	boolean flightYN;
	boolean wildYN;		// 야생동물인지 아닌지 boolean 인스턴스 변수 생성
	static private int birdcount = 0;	// 클래스 변수를 생성하여 새 숫자 count

	boolean getFlight() {
		return flightYN;
	}
	boolean getWild() {		// boolean값을 받아오는 인스턴스 메소드 생성
		return wildYN;
	}
	Bird(){		// 생성자에서 birdcount를 1씩 증가시킨다
		setBirdcount(getBirdcount() + 1);
	}
	public static int getBirdcount() {
		return birdcount;
	}
	public static void setBirdcount(int birdcount) {
		Bird.birdcount = birdcount;
	}
 }

public class homework32 {

	public static void main(String[] args) {
		
		// Dog 
		Dog Dalmatian1 = new Dog();
		Dalmatian1.age = 7;
		Dalmatian1.color = "빨강";
		Dalmatian1.name = "뚱이";
		Dalmatian1.weight = 15;
		Dalmatian1.speed = 20;
		
		Dog Dalmatian2 = new Dog();
		Dalmatian2.age = 12;
		Dalmatian2.color = "노랑";
		Dalmatian2.name = "홀쭉이";
		Dalmatian2.weight = 5;
		Dalmatian2.speed = 30;
		
		Dog Dalmatian3 = new Dog();
		Dalmatian3.age = 10;
		Dalmatian3.color = "녹색";
		Dalmatian3.name = "점박이";
		Dalmatian3.weight = 6;
		Dalmatian3.speed = 50;
		
		Dog Dalmatian4 = new Dog();
		Dalmatian4.age = 5;
		Dalmatian4.color = "파란색";
		Dalmatian4.name = "날쌘이";
		Dalmatian4.weight = 10;
		Dalmatian4.speed = 70;
		
		// Bird
		Bird Parrot1 = new Bird();
		Parrot1.age = 5;
		Parrot1.color = "빨강";
		Parrot1.flightYN = true;
		Parrot1.wildYN = false;
		
		Bird Parrot2 = new Bird();
		Parrot2.age = 3;
		Parrot2.color = "녹색";
		Parrot2.flightYN = true;
		Parrot2.wildYN = true;
		
		Bird Parrot3 = new Bird();
		Parrot3.age = 7;
		Parrot3.color = "파란색";
		Parrot3.flightYN = false;
		
		
		System.out.println("강아지의 나이는 " + Dalmatian1.age + "살이고, 강아지의 이름은 " + Dalmatian1.name + "고, 색깔은 " + Dalmatian1.color 
							+ "고, 몸무게는 " + Dalmatian1.getWeight() + "Kg 이고, 스피드는 " + Dalmatian1.getSpeed() + "Km/h 입니다.");
		System.out.println("강아지의 나이는 " + Dalmatian2.age + "살이고, 강아지의 이름은 " + Dalmatian2.name + "고, 색깔은 " + Dalmatian2.color 
							+ "고, 몸무게는 " + Dalmatian2.getWeight() + "Kg 이고, 스피드는 " + Dalmatian2.getSpeed() + "Km/h 입니다.");
		System.out.println("강아지의 나이는 " + Dalmatian3.age + "살이고, 강아지의 이름은 " + Dalmatian3.name + "고, 색깔은 " + Dalmatian3.color
							+ "고, 몸무게는 " + Dalmatian3.getWeight() + "Kg 이고, 스피드는 " + Dalmatian3.getSpeed() + "Km/h 입니다.");
		System.out.println("강아지의 나이는 " + Dalmatian4.age + "살이고, 강아지의 이름은 " + Dalmatian4.name + "고, 색깔은 " + Dalmatian4.color 
							+ "고, 몸무게는 " + Dalmatian4.getWeight() + "Kg 이고, 스피드는 " + Dalmatian4.getSpeed() + "Km/h 입니다.");
		System.out.println("현재 Dalmatian의 숫자는 ==> "+Dog.getDogcount());
		System.out.print("\n");
		
		System.out.println("새의 나이는 " + Parrot1.age + "살이고, 날 수 " + (Parrot1.getFlight() ? "있" : "없") 
							+ "고, 야생동물 " + (Parrot1.getWild() ? "입" : "아닙") + "니다.");
		System.out.println("새의 나이는 " + Parrot2.age + "살이고, 날 수 " + (Parrot2.getFlight() ? "있" : "없") 
							+ "고, 야생동물 " + (Parrot2.getWild() ? "입" : "아닙") + "니다.");
		System.out.println("새의 나이는 " + Parrot3.age + "살이고, 날 수 " + (Parrot3.getFlight() ? "있" : "없") 
							+ "고, 야생동물 " + (Parrot3.getWild() ? "입" : "아닙") + "니다.");
		System.out.println("현재 Parrot의 숫자는 ==> "+Bird.getBirdcount());
	}

}