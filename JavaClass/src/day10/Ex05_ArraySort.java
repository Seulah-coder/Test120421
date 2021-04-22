package day10;

public class Ex05_ArraySort {

	public static void main(String[] args) {
		/*
		 * 배열정렬 오름차순 또는 내림차순 정렬
		 * 
		 */

		int[] num = { 3, 2, 1, 5, 4 };

		int temp = 0;

		// 정렬하기 전 배열 값 확인
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		for (int i = 0; i < num.length; i++) {
		//i의 값 설정
			for (int j = i + 1; j < num.length; j++) {
			//i의 값과 비교할 j값 설정
				
				// swap 자리 바꾸기
				if (num[i] > num[j]) { //i와 j를 비교 3>2
					temp = num[i]; //i의 값을 temp에 저장 3
					num[i] = num[j]; //j의 숫자 2를 i에 대입함 
					num[j] = temp; // temp에 있는 숫자를 j자리에 대입함
				}
			}

		}
		// 정렬 후 배열 값 확인
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}


