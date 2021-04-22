package day8;

import java.util.Scanner;

public class Ex04_whileEx_CountSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int num = 0;
		int sum = 0;
		int count = 0;
		
		boolean run = true;
		
		while(run) { 
			num = scan.nextInt();
			sum = sum + num;
			
			if(num == 0 ) {
				run = false;
			} else {
				count++;
			}
			
		} 
		System.out.println("입력한 수는" + count + "개");
		System.out.println("평균은" + (sum/count)+ "입니다.");

	}

}
