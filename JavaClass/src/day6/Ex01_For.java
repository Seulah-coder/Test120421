package day6;

public class Ex01_For {

	public static void main(String[] args) {
		/*
		 * 
		 * for문(반복문)
		 * 반복문 : 어떠한 조건에서 똑같은 내용을 계속 반복실행해야 할 때
		 * 			그리고 특정 조건에 도달하면 반복을 멈춤
		 * 반복조건, 반복종료조건(특정 값 또는 특정 횟수를 지정 // 시간 개념을 따지지는 않음 ex. 1분동안 반복 X 이런건 안됨)
		 * 
		 */
		//1,2,3,4,5를 서로 다른줄에 출력해보세요
		
//		int num = 0;
//		num = 0;
//		System.out.println(++num);
//		System.out.println(++num);
//		System.out.println(++num);
//		System.out.println(++num);
//		System.out.println(++num);
		
		System.out.println("for 문 시작전");
		
		for(int  i=1; i<=3; i++) {
			System.out.println("for문 내부");
			// 1-2-3-4-2-3-4-2-3-4-2 종료
			//반복변수(i)는 단순히 반복횟수를 지정하기 위해서도 사용하지만
			//반복변수를 일정하게 증가시키거나 감소시킬 수도 있기 때문에
			//반복변수의 값을 연산에 사용하기도 함
			
			//반복변수값 확인 - 반복조건체크 - for 블록 안의 내용 실행 -
			//반복변수 증감식 적용 - 반복조건체크 - for 블록 안의 내용 실행
			//반복조건체크시 조건에 맞지 않다면 for 블록 내용 실행하지 않고 종료
			System.out.println("반복변수 i 값: " + i);
		}
		System.out.println("for문 종료후");
		
	}

}
