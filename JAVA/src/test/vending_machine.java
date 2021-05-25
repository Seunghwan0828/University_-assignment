package test;

import java.util.Scanner;

public class vending_machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money, menu;
		System.out.print("돈을 투입하세요 : ");
		Scanner m = new Scanner(System.in);
		money = m.nextInt();
		System.out.print("\n[자판기 판매 메뉴]\n"
				+ "1. 콜라 	가격: 500₩\n"
				+ "2. 사이다	가격: 400₩\n"
				+ "3. 생수 	가격: 300₩\n"
				+ "4. 커피  	가격: 700₩\n\n");
		if(money >= 300) {	
			vending_macine: do{
				if(money < 300) {
					System.out.println("잔돈이 부족합니다.");
					break vending_macine;
				}
				else {
					System.out.print("메뉴번호를 선택하세요 (종료 : 0) : ");
					Scanner n = new Scanner(System.in);
					menu = n.nextInt();
					switch(menu) {
					case 0:
						System.out.println("종료합니다.");
						break vending_macine;
					case 1:
						if(money >= 500) {
							money = money-500;
							System.out.printf("잔돈은 %d 입니다.\n",money);
							break;
						}
						else
							System.out.println("잔돈이 부족합니다.");
							break vending_macine;
					case 2:
						if(money >= 400) {
							money = money-400;
							System.out.printf("잔돈은 %d 입니다.\n",money);
							break;
						}
						else
							System.out.println("잔돈이 부족합니다.");
							break vending_macine;
					case 3:
						if(money >= 300) {
							money = money-300;
							System.out.printf("잔돈은 %d 입니다.\n",money);
							break;
						}
						else
							System.out.println("잔돈이 부족합니다.");
							break vending_macine;
					case 4:
						if(money >= 700) {
							money = money-700;
							System.out.printf("잔돈은 %d 입니다.\n",money);
							break;
						}
						else
							System.out.println("잔돈이 부족합니다.");
							break vending_macine;
					default:
						System.out.println("다시 선택해주세요.");
						}
				}
			}while(true);
		}
		else
			System.out.println("잔돈이 부족합니다.");
	}

}
