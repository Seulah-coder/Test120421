package day8;

import java.util.Scanner;

public class Ex07_BankTeacherCode {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int balance = 0;
		int deposit = 0;
		int withdraw = 0;
		int select = 0;

		boolean run = true;
		while (run) {
			System.out.println("--------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");
			System.out.print("선택>");
			select = scan.nextInt();

			switch (select) {
			case 1:
				// 입금기능
				System.out.println("예금액>");
				deposit = scan.nextInt();
				balance = balance + deposit;
				System.out.println("현재 잔액은 " + balance + "입니다.");
				break;
			case 2:
				// 출금기능
				System.out.println("출금액>");
				withdraw = scan.nextInt();
				// 출금처리가 가능한 경우, 불가능한 경우 설정
				if (withdraw > balance) {
					System.out.println("잔고가 부족합니다.");
					System.out.println("현재 잔액은 " + balance + "입니다.");
				} else {
					balance = balance - withdraw;
					System.out.println("현재 잔액은 " + balance + "입니다.");
				}

				break;
			case 3:
				// 잔액기능
				System.out.println("현재 잔액은 " + balance + "입니다.");
				break;
			case 4:
				// 종료기능
				System.out.println("종료합니다.");
				run = false;
				break;

			}
		}

	}

}
