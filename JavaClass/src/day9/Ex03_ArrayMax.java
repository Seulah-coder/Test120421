package day9;

import java.util.Scanner;

public class Ex03_ArrayMax {

	public static void main(String[] args) {
		/*
		 * 
		 * 크기가 5인 정수형 배열에 스캐너로 값을 입력받아
		 * 입력된 값 중에서 가장 큰 값 출력하기
		 * {3,1,5,2,4}
		 * 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		int[] number1 = null;
		number1= new int[5];
	
	
		System.out.println("숫자를 입력하세요.");
		
		int max = 0;
		for (int i = 0; i < number1.length; i++) {
			System.out.print((i+1)+ "번째 숫자 입력 : ");
			number1[i]= scan.nextInt();
			

			if(number1[i]>max) {
				max = number1[i];
				
			
			}
		}	System.out.println("최대값 :" + max);


	}

}
