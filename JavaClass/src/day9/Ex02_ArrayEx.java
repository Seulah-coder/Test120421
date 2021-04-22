package day9;

import java.util.Scanner;

public class Ex02_ArrayEx {

	public static void main(String[] args) {
		/*
		 * 크기가 3인 정수형 배열을 선언하고
		 * 스캐너를 이용해 배열에 값을 저장한 다음
		 * 입력된 값의 총합, 평균을 계산하세요.
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		
		int sum = 0;


		int[] number1 = null;
		number1= new int[3];
	
	
		System.out.println("숫자를 입력하세요.");
		
		for (int i = 0; i < number1.length; i++) {
			System.out.print((i+1)+ "번째 숫자 입력 : ");
			number1[i]= scan.nextInt();
			sum = sum + number1[i];
		}

		System.out.println("합계:" + sum);
		System.out.println("평균:" + sum / number1.length);
		
	}

}
