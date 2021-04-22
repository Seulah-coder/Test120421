package day2;

public class Ex6_LogicalOperator {
	
	public static void main(String[] args) {
		/*
		 * 논리연산자
		 * &&(AND 연산자) : a && b
		 * a,b에 올 수 있는 요소는
		 *  - 논리형(boolean) 변수,
		 *  - T,F가 결과로 나오는식(비교연산식 등)
		 * a,b 모두 T면 결과는 T
		 * a,b 둘중 하나라도 F면 결과는 F
		 * 
		 * ||(OR 연산자) : a || b
		 * a,b 둘중 하나라도 T면 결과는 T
		 * a,b 모두 F면 결과는 F
		 * 
		 * !(NOT 연산자) : !a
		 * a가 T면 F로
		 * a가 F면 T로
		 * 
		 */
		
		boolean result;
		result = true && true;
		System.out.println(result); // 예상결과 : true
		
		result = true && false;
		System.out.println(result); // 예상결과 : false
		
		result = false && true;
		System.out.println(result); // 예상결과 : false
		// 처음부터 false가 나와서 무조건 false가 됨 = dead code
		
		result = false && false;
		System.out.println(result); // 예상결과 : false
		// 처음부터 false가 나와서 무조건 false가 됨 = dead code
		
		result = (5>3) && (5==3);
		System.out.println(result); // 예상결과 : false
		
		result = (5>3) || (5==3);
		System.out.println(result); // 예상결과 : true
		// 이미 처음에 true의 결과값이 나와서 or(||논리연산자)의 의미가 없음 = dead code
		
		boolean var1 = !(5>3);
		System.out.println(var1);
		
	}

}
