package day12;

public class Cal {
	
	int num1;
	int num2;
	
	// 메소드를 정의할 때
	// 리턴타입, 메소드이름, 매개변수유무, 실행내용(리턴유무)을 반드시 확인

	// sum1 메소드
	
	// void : 리턴이없음, sum1 : 메소드 이름, int num1,int num2 : 매개변수
	void sum1(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	// sum2 메소드
	
	int sum2(int num1, int num2) {
		
		int sum = num1 + num2;
		return sum;
	}
	
	

	}

