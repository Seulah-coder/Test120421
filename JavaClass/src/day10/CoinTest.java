package day10;

import java.util.Scanner;

public class CoinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] coin = { 500, 100, 50, 10 };

		// 거스름돈 계산하기
		int change = 0;
		System.out.println("금액 입력: ");
		change = scan.nextInt();

		for (int i = 0; i < coin.length; i++) {
			// 입력받은 숫자와 배열에 있는 값을 하나하나 나누기

			int result = 0;
			
				result = change / coin[i];
				System.out.println(coin[i] + "원 동전" + result + "개");
				change = change % coin[i];
				
			}
		}

	}


	




