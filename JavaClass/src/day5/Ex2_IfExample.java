package day5;

import java.util.Scanner;

public class Ex2_IfExample {

	public static void main(String[] args) {
		/*
		 * 숫자 세개를 입력받아 가장 큰 숫자 출력하기
		 * (단 같은 숫자는 입력되지 않는다고 가정)
		 * 
		 * 번외 문제
		 * 가장 큰 수를 담을 max라는 변수를 추가로 선언해서
		 * 큰 숫자를 출력하는 print문을 한줄만 써보세요.
		 */
		Scanner scan = new Scanner(System.in);
		
		int a,b,c,max;
		System.out.print("숫자를 입력하세요(중복숫자불가) :");
		a = scan.nextInt();
		System.out.println("숫자를 입력하세요(중복숫자불가) : ");
		b = scan.nextInt();
		System.out.println("숫자를 입력하세요(중복숫자불가) : ");
		c = scan.nextInt();
		

		
//			if(a > b) {
//				
//				if(a > c) {
//					System.out.println(a);
//				} else {
//					System.out.println(c);
//				}
//				
//			} else if(b > a) {
//				
//				if(b > c) {
//					System.out.println(b);
//				} else {
//					System.out.println(c);
//				}
//			}
//			
		
		if ( a > b) {
			if(a > c) {
				max = a;
			} else {
				max = c;
			}
			
		} else {
			if (b > c) {
				max = b;
			}else {
				max = c;
			}
			
		}
		System.out.println("가장 큰 수는" + max + "입니다.");	
		
/*
 *   선생님 코드 if( a > b && a > c) {
 *   	System.out.println(a);
 *   } else if ( b > a && b > c) {
 *   	System.out.println(b); 
 *   } else if ( c > a && c > b) {
 *   	System.out.println(c);
 * 
 * 
 */
		scan.close();
	}

}
