package day2;

public class Ex2_Operator {

	public static void main(String[] args) {
		/*
		 * 연산자(Operator): 연산(계산)에 사용하는 기호
		 * + : 덧셈
		 * - : 뺄셈
		 * * : 곱셈
		 * / : 나눗셈
		 * % : ??
		 */
		
		//문제 : 정수형 변수 2개 선언
		//각각의 연산자 계산결과 출력
		//계산 결과를 저장할 변수를 하나 더 써도됨
		
		int a = 5;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		
		// or
		
		int result;
		result = a + b;
		System.out.println("+ 결과:" + result);
		result = a - b;
		System.out.println("- 결과:" + result);
		result = a * b;
		System.out.println("* 결과:" + result);
		
		// 정수형 변수간의 나눗셈 결과값은 몫이다.
		result = a / b;
		System.out.println("/ 결과:" + result);
		result = a % b;
		System.out.println("% 결과:" + result);
		
		double c, d;
		double result1;
		
		c = 4.3;
		d = 8.9;
		result1 = c/d;
		System.out.println("/ 결과 : " + result1);
	
		
	}

}
