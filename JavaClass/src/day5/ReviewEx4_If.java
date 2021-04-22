package day5;

import java.util.Scanner;

public class ReviewEx4_If {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * 조건문(if else, switch case)
		 * 
		 * if(condition) {
		 * 
		 * 조건이 맞을 때 실행할 부분
		 * 
		 * } else {
		 * 
		 * 조건이 맞지 않을 때 실행할 부분
		 * 
		 * } condition 자리에는 비교 연산식, 논리연산식, boolean 변수 이름, T,F등이 올 수 있음
		 * 
		 */
		
		int num = 0;
		System.out.println("숫자를 입력하세요:");
		num = scan.nextInt();
		
		if(num > 0) {
			System.out.println("양수입니다.");
			if(num % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		} else if(num == 0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("음수입니다.");
			
		}
		
		scan.close();

	}

}
