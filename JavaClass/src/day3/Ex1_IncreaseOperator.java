package day3;

public class Ex1_IncreaseOperator {

	public static void main(String[] args) {
		/*
		 * 증감연산자 (++,--)
		 * 변수 앞 또는 변수 뒤에 사용
		 * 위치에 따라 역할이 달라짐
		 * ++var : var가 가지고 있는 값에 1을 더한 후 연산에 사용
		 * var++ : var가 가지고 있는 값을 연산에 사용 후 var의 값을 1증가
		 * 
		 */
		
		int num1 = 10;
		int num2 = 10;
		int num3;
		
		
		//++이 변수 앞에 붙을 때
		System.out.println("num1 :" + num1); // 예상 : 10
		num3 = ++num1 + 10; // 11+10
		System.out.println("num1 :" + num1); // 예상 : 11
		System.out.println("num3 :" + num3); // 예상 : 21
		
		//++이 변수 뒤에 붙을 때
		System.out.println("num1 :" + num1); //예상 : 10 (실제 결과값: 11) 위에서 이미 ++num1으로 연산되어 11이 됨
		num3 = num1++ + 10; // 11+10 계산이 끝나면 num1의 값에서 1을 증가
		System.out.println("num1 :" + num1); //예상 : 10 (실제 결과값: 12) 11+1
		System.out.println("num3 :" + num3); //예상 : 21

		/*
		 * 1.num1= 11
		 * 2.num1이 가지고 있는 값을 먼저 계산에 활용
		 * 3.11 + 10 결과를 num3에 대입. num3 값은 21
		 * 4.num1 뒤에 붙은 증감연산자를 처리해야 하기 때문에 num1값은 12가 됨
		 * 
		 */
		
		// num1=12, num2=10, num3=21
		num3 = num1++ + num2++; //12 + 10, num3=22 
		//계산이 일단 여기서 끝남
		//그 후 num1,num2의 각각 변수 값이 1증가함 num1=13,num2=11
		System.out.println("num1 :" + num1); // 예상 13
		System.out.println("num2 :" + num2); // 예상 11
		System.out.println("num3 :" + num3); // 예상 22


	}

}
