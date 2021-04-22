package day13;

import java.util.Scanner;

import day12.Student;

public class CalMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Cal calculation = new Cal();
		
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("  1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 나눗셈 ");
			System.out.println("-------------------------------------");
			System.out.print("선택>");
			int select = scan.nextInt();
			
			int num1 = 0, num2 = 0;
			
			switch(select) {
			case 1 :
				// 덧셈 메소드 호출
				
				num1 = 3;
				num2 = 10;
				calculation.plus(num1, num2);
				break;
				
			case 2:
				// 뺄셈 메소드 호출
				System.out.println("정수 두개를 입력하세요");
				num1 = scan.nextInt();
				num2 = scan.nextInt();
				
				calculation.minus(num1, num2);
				break;
				
			case 3: 
				// 곱셈 메소드 호출
				System.out.println("정수 두개를 입력하세요");
				num1 = scan.nextInt();
				num2 = scan.nextInt();
				
				int result = calculation.multiplication(num1, num2);
				System.out.println(result);
				break;
				
				
			case 4: 
				// 나눗셈 메소드 호출
				
				int result1 = calculation.division(num1, num2);
				System.out.println(result1);
				
				break;
			}
			
			
		}

	}

}
