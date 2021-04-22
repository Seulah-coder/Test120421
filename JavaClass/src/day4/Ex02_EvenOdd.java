package day4;

import java.util.Scanner;

public class Ex02_EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number, result = 0;
		System.out.println("숫자를 입력하세요: ");
		number = scan.nextInt();
		
		result = number % 2;
		
		if (number > 0) {
			if (result == 0) {
			System.out.println("짝수 입니다.");
			}else
			System.out.println("홀수 입니다.");{
				
			}
		} else {
			System.out.println("0보다 큰 수를 입력해 주세요.");
		}
		
		scan.close();

		}

	}

