package day7;

import java.util.Scanner;

public class Ex5_ForEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력: ");
		int a = scan.nextInt();
		int sum = 0;
		// 1. 1부터 입력받은 숫자까지 만들기
		// 2. 숫자 중에서 2,3의 배수가 아닌 숫자 걸러내기
		// 3. 걸러낸 숫자들의 합계 구하기

		for (int i = 1; i <= a; i++) {
			
			
			if (i% 2 == 0 || i% 3 == 0) {
				//2의배수, 3의배수
				
			} else {
				sum += i;
			}  

//			선생님 코드
//			if(i%2 !=0 && i%3 != 0) {
//				sum += i;
//			
//			}
			
		} 
		System.out.println("1부터" +a+"까지 2,3 배수 제외한 합계 : " +  sum);
		
	

	}
}


