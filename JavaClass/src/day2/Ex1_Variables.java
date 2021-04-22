package day2;

public class Ex1_Variables {

	public static void main(String[] args) {
		/*
		 * 변수선언, 값 대입, 출력
		 * var1 : 10을 가지고있는 정수형 변수
		 * var2 : 0.1234를 가지고 있는 실수형 변수
		 * var3 : true를 가지고 있는 논리형 변수
		 * var4 : 오늘은 수요일을 가지고 있는 문자열 변수
		 * 선언 및 값 대입 후 
		 * var1, var2, var3, var4의 값을 각각 출력하기
		 * 
		 */
		int var1 = 10;
		double var2 = 0.1234;
		boolean var3 = true;
		String var4 = "오늘은 수요일";
		
		System.out.println("var1 :" + var1);
		System.out.println("var2 :" + var2);
		System.out.println("var3 :" + var3);
		System.out.println("var4 :" + var4);
		
		// +의 역할은 연결
		System.out.println(var2+var2);
		
		int var5;
		var5 = 10;
		
		int var6;
		var6 = 8;
		
		var5 = var6;
		
		System.out.println("var5 :" + var5);
		System.out.println("var6 :" + var6);
		
		int sum = 0;
		sum = var5 + var6;
		System.out.println("sum: " + sum);
		sum = 100;
		System.out.println("sum: " + sum);
		int sum1 = 10;
		System.out.println("sum1: " + sum1);
		
	}

}
