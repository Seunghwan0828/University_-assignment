package test;
import java.util.Random;
import java.util.Scanner;

public class Slot_machine_do_while {

	public static void main(String[] args) throws InterruptedException {
		Scanner s = new Scanner(System.in);		// 입력받을 스캐너
		Random r = new Random();		// 랜덤 함수
		int menu, i, j, k, money=1000;	// menu: 사용자가 입력한 메뉴값, i,j,k: 랜덤값, money: 초기자금
		String[][][] fruit=		// ASCII art로 그린 과일그림 3차원 배열에 초기화
			{
				{
					{"                  "},
					{"                  "},
					{"                  "},
					{"                ╓²"},
					{" ]≥            ;╙ "},
					{"  ╠▒▒≥,     ,≤░≥# "},
					{"  \"╚▒▒▒▒░░▒▒▒▒╙  "},
					{"      =╚╩╩╩╩╩≈    "},
					{"                  "},
					{"                  "},
					{"                  "}
				},
				{
					{"                  "},
					{"                  "},
					{"                  "},
					{"     «≥░≤▄∩,      "},
					{"    ╩▒▒░░░░░▒     "},
					{"   ]╠╬╬╬╬╠╠╠▒≥    "},
					{"    ╚╬╬╣╣╣╬╬╠     "},
					{"     ╚╢╬╬╬╬╙      "},
					{"                  "},
					{"                  "},
					{"                  "}
				},
				{
					{"                  "},
					{"                  "},
					{"          φ  g    "},
					{"      «µ≡\"^▀╗▒   "},
					{"    :╬╣Q«╬▓▓▐╠▀└  "},
					{"    ╠╬╓W╣╩╣▓█▓▓µ╜ "},
					{"   ╘║]╬╬▓▓▓▓▓██▓÷ "},
					{"   ╚▒Σ║╣▓▓▓▓██▓╜  "},
					{"   ª╠╠╬╬▓▓██▓Γ    "},
					{"                  "},
					{"                  "}
				}
				
				
		};
		
		do {	// do while문으로 메뉴먼저 실행
			System.out.println("[1]게임 시작	[2]잔돈 확인	[0]게임 종료");
			menu = s.nextInt();
			
			switch(menu) {		// switch문으로 메뉴 선택시 실행될 case지정
			case 1:
				i = r.nextInt(3);
				j = r.nextInt(3);
				k = r.nextInt(3);
				int[] array = {i,j,k};		// 랜덤으로 생성된 0~2까지의 수를 array배열에 저장
				for(int b=0; b<fruit[0].length; b++) {
					for(int a=0; a<fruit.length; a++) {
						for(int c=0; c<fruit[0][0].length; c++) {
							System.out.print(fruit[array[a]][b][c]);	// 랜덤으로 생성된 값을 ASCII art로 가로로 출력
						}
						System.out.print("\t");
					}
					System.out.println();
				}
				if(i == j && j == k && k == i) {	// 랜덤을 생성된 값들이 모두 같을때 +100
					money += 100;
					Thread.sleep(1000);		// 모두 같을때 지연시간 1000
					System.out.println("모두 같습니다.");
				}
				else if(i == j || j == k || k == i) {		// 랜덤을 생성된 값들이 두개 같을때 +50
					money += 50;
					Thread.sleep(500);		// 두개 같을때 지연시간 500
					System.out.println("두개가 같습니다.");
				}
				else {
					money -= 100;
					System.out.println("셋다 다릅니다.");		// 랜덤을 생성된 값들이 모두 다를때 -100 
				}
				System.out.printf("잔돈은 %d입니다. \n\n",money);		// 게임이 한번 실행될때마다 잔돈 출력 
				break;
			case 2:
				System.out.printf("잔돈은 %d입니다. \n\n",money);		// 잔돈확인을 선택했을경우 잔돈 출력
				break;
			}
			if(money < 0)	// 초기자금이 0보다 작아질경우 게임 종료
				break;
			}while(menu != 0);		// 0을 선택하지 않을때까지 게임 실행 
		System.out.printf("최종잔돈은 %d입니다.\n",money);		// 최종점수 출력 
		}
	}
