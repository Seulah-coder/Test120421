package day18;

import java.util.Scanner;

public class TryCatch_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 나눗셈을 할 때 
		// a/b에서 b가 0이면 발생하는 예외를 확인하고
		// 예외처리를 할 수 있는 코드를 작성하기
		// 예외가 발생하는 경우 "0으로 나눌 수 없습니다."를 출력
		
		int a, b= 0;
		System.out.println("정수 입력:");
		a = scan.nextInt();
		System.out.println("정수 입력:");
		b = scan.nextInt();
		
		
		
			try {
				int division = a/b;
				System.out.println(division);
				
			}catch(ArithmeticException e){
				System.out.println("0으로 나눌 수 없습니다.");
			}catch( Exception e) { // exception은 여러번 사용 가능함
				System.out.println("다른 예외");
			}
			
			
			
			
		
	}

}
