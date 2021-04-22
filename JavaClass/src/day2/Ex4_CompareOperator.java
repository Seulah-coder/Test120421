package day2;

public class Ex4_CompareOperator {

	public static void main(String[] args) {
		/*
		 * 비교 연산자
		 * 부등호(<, >, <=, >=, ==, !=)
		 * 비교 연산자의 결과는 값이 true나 false로 나옴 (ex: 5>3 = true)
		 * a == b : a,b 값이 같으면 T, 다르면 F
		 * a != b : a,b 값이 같으면 F, 다르면 T
		 */
		
		//두개의 정수형 변수 선언 후 각각 비교연산 결과값 출력
		
		int a,b;
		a = 5;
		b = 8;
		
		System.out.println(a>b);
		//System.out.println(" a>b의 결과:" + a>b);
		//위 코드의 경우 오류 발생. >를 연산자로 인식함.
		//System.out.println(" a>b의 결과:" + (a>b));
		//우선으로 연산해야 할 것을 ( )로 지정해 주면 오류 발생되지 않음
		//예를들어 3+5*8의 경우 (3+5)*8로 지정해야 3+5 먼저 계산이 됨
		
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		//or 
		
		boolean result;
		result = a < b;
		System.out.println(" a>b의 결과:" + result);
		
		result = a <= b;
		System.out.println(" a<=b의 결과:" + result);
		
		result = a >= b;
		System.out.println(" a>=b의 결과:" + result);
		
		result = a == b;
		System.out.println(" a==b의 결과:" + result);
		
		result = a != b;
		System.out.println(" a!=b의 결과:" + result);
		//결과값을 따로 계산해주고 출력할때는 결과값 선언한 것만 입력



	}

}
