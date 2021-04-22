package day3;

import java.util.Scanner;

public class Ex3_Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;

		
		System.out.println("첫번째 숫자를 입력하세요: ");
		a = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요: ");
		b = scan.nextInt();
		
		int result = a + b;
		System.out.println("덧셈 결과는 " + result + "입니다.");
		//System.out.println("덧셈 결과는" + num1 + num2 + "입니다");라고 작성할 경우 결과는 덧셈결과는 "1020입니다." 라고 나옴.
		//num1 + num2가 먼저 연산되지 않고 연결로 인식함. 올바른 계산 결과가 나오기 위해서는 ("덧셈 결과는" +(num1 + num2) + "입니다")로 작성해서 숫자가 먼저 연산되게 해야함
		System.out.println("덧셈 결과는" +(a + b) + "입니다");
		
		scan.close();

	}

}
