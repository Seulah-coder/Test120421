package day2;

public class Ex5_AssignmentOperator {

	public static void main(String[] args) {
		/*
		 * 대입연산자
		 * +=,-=,*=,/=,%=
		 * a+= b => a = a + b
		 * a값이 바뀐다는 것에 주의
		 */
		
		//정수형 변수 2개 선언하여 대입연산자 수행 결과 출력
		
		int num1,num2;
		num1 = 5;
		num2 = 3;
		
		//예상결과를 적어보고 결과가 일치하는지 보기. 결과가 틀리다면 왜 틀린지 연구하기
		System.out.println(num1 += num2); // num1 = num1 + num2 (예상: 5 + 3 = 8)
		// = 예상과 같음
		
		System.out.println(num1); //5
		// = 예상과 다름 (위에서 이미 연산된 값이 num1에 대입되어 실제 결과값은 8)
		
		System.out.println(num2); //3
		
		System.out.println(num1 -= num2); // num1 = num1 - num2 (예상: 5 -3 = 2)
		// = 예상과 다름 (위에서 이미 연산된 값이 num1에 대입되어 실제 결과값은 8 -3 = 5)
		
		System.out.println(num1 *= num2); // num1 = num1 * num2  (예상: 5 * 3 = 15)
		// = 예상과 같음 (위에서 이미 연산된 값이 다시 num1값으로 돌아옴 결과값은 15
		
		System.out.println(num1 /= num2); // num1 = num1 /= num2 (예상: 5 / 3 = 1)
		// = 예상과 다름 (위에서 이미 연산된 값이 num1에 대입되어 실제 결과값은 15 /3 = 5)
		
		System.out.println(num1 %= num2); // num1 = num1 % num2 (예상: 5 % 3 = 2)
		// = 예상과 같음 (위에서 이미 연산된 값이 다시 num1값으로 돌아옴 결과값은 2
			

	}

}
