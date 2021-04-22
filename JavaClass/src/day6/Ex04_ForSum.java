package day6;

import java.util.Scanner;

public class Ex04_ForSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b = 0;
		System.out.println("시작값을 입력하세요 :");
		a = scan.nextInt();
		System.out.println("종료값을 입력하세요 :");
		b = scan.nextInt();
		
		
		int sum = 0;
		for(int i=a; i<=b; i++) {
			sum = sum + i;
			
			System.out.print(i);
			if (i == b) {
				System.out.print("=" + sum );
				
			}else {
			System.out.print("+");
			
			}
			
		}
		System.out.println();
		System.out.println(a + "부터" + b + "까지의 합은" + sum + "입니다.");
		
		scan.close();
	}
	

}
