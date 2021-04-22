package day8;

import java.util.Scanner;

public class Ex07_Bank {

	public static void main(String[] args) {
		/*
		 * 입금, 출금, 잔액조회 기능
		 * 초기 잔액은 0
		 * 
		 * 프로그램 개발 프로세스
		 * 회사 요구사항(결과,기능,입력) -기능정의 - 기능설계 -프로그램 개발 - 테스트 - 디버깅 - 출시
		 */
		
		int deposit = 0;
		int withdraw = 0;
		int balance = 0;
		int choice = 0;
		
		boolean run = true;
		Scanner scan = new Scanner(System.in);

		
		do {
			
			System.out.println("-------------------------------");
			System.out.println("1.입금 | 2. 출금 | 3. 잔액| 4. 종료");
			System.out.println("-------------------------------");
			System.out.println("선택>");
			choice = scan.nextInt();
			
			if(choice == 1) {
				System.out.println("입금액>");
				deposit = scan.nextInt();
				balance = balance + deposit;
				System.out.println("입금된 금액은" + deposit + "입니다.");
				System.out.println("현재 잔고 금액은" + balance + "입니다.");
				
			} else if(choice == 2) {
				System.out.println("출금액>");
				withdraw = scan.nextInt();
				if(withdraw > balance ) {
					System.out.println("출금될 금액이 잔고보다 많습니다");
				} else {
					balance = balance - withdraw;
					System.out.println(withdraw + "원이 출금 되었습니다." + balance + "원 남았습니다.");
				}
			} else if(choice == 3) {
			
				System.out.println("잔고는" + balance + "원 입니다");
			
			} else {
				System.out.println("종료합니다");
				
			}
				
			} while(run);

	}

}
