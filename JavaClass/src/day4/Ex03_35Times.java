package day4;

import java.util.Scanner;

public class Ex03_35Times {

	// 정수를 입력 받아 3의 배수, 5의 배수인지 출력. 공배수인 경우 공배수 입니다. 출력
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number = 0;
		System.out.println("숫자를 입력하세요: ");
		number = scan.nextInt();

		
		if (number > 0) {
			if (number % 3 == 0 && number % 5 == 0) {
				System.out.println("공배수 입니다.");
				} else if (number % 5 == 0) {
				System.out.println("5의 배수 입니다.");
				} else if(number % 3 == 0) {
					System.out.println("3의 배수 입니다.");
				} else {
					System.out.println("3의 배수, 5의 배수가 아닙니다.");
				}
			} else {
				System.out.println("양수를 입력하세요");
			}
		scan.close();
	
		}

	}
