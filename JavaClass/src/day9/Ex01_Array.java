package day9;

public class Ex01_Array {

	public static void main(String[] args) {
		/*
		 * 배열(Array) : 같은 타입의 데이터를 하나의 배열 변수에 여러 개 담을 수 있게 함.
		 * 
		 */

		int num = 0;
		// 정수 타입의 number라는 이름의 배열 변수 선언
		// []대괄호가 있어야 컴파일러가 배열이라고 인식함
		int[] number;
		int number1[];
		// 배열선언과 동시에 초기값
		int[] number2 = { 1, 2, 3 };
		String[] strArray = { "가나다라", "abcd", "가1a2~!@" };

		int[] number3 = { 4, 5, 6, 7, 20, 100 };
		// 특정 위치의 값 출력하기
		// number3의 7을 출력하고 싶다면
		// 4번째 칸에 있는 값을 출력한다는 것
		// 0번부터 시작하여 0,1,2,3,4 번 index

		System.out.println(number3[3]);

		// number2 변수에서 2를 출력해보세요
		System.out.println(number2[1]);

		System.out.println(); // 띄어쓰기

		// number3의 4번 인덱스값을 500으로 변경하기
		System.out.println(number3[4]); // 변경전
		number3[4] = 500;
		System.out.println(number3[4]); // 변경후

		System.out.println(); // 띄어쓰기

		// System.out.println(number3[6]); -> 작동 안됨 out of bounds

		// 배열이름.length : 배열의 크기를 알려줌
		// 인덱스 보다 1큼
		System.out.println(number3.length); // 출력값은 6(=크기) 그치만 인덱스는 1-6이 아닌 0-5
		// number3의 크기: 6
		// number3의 인덱스 : 0~5

		System.out.println(); // 띄어쓰기
		// for문을 이용하여 배열에 저장된 값 출력하기
		System.out.println(number3[0]);
		System.out.println(number3[1]);
		System.out.println(number3[2]);
		System.out.println(number3[3]);
		System.out.println(number3[4]);
		System.out.println(number3[5]);

		for (int i = 0; i < number3.length; i++) {
			System.out.println(number3[i]);
		}
		//순서대로 출력되는 반복문에만 사용

		System.out.println(); // 띄어쓰기

		// number 4 배열 변수에 저장된 값이 총합과 평균을 출력.
		int[] number4 = { 1, 6, 10, 100 };

		int sum = 0;
		for (int i = 0; i < number4.length; i++) {

			sum = sum + number4[i];

		}
		System.out.println("합계:" + sum);
		System.out.println("평균:" + sum / number4.length);

		
		
		// 초기값을 주지 않고 배열 선언
		int[] number5 = null;
		number5=new int[5];
		// 0,1,2,3,4,5 = length 6 
		
		// 크기(length)가 6인 정수형 배열 선언
		int[] number6 = new int[6];

		// 선언과 초기화를 동시에
		System.out.println(number6.length);
		System.out.println(number6[5]);
		
		}

	
	}


