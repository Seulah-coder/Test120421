package day7;

import java.util.Scanner;

public class Ex3_Star {

	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
	        int a = scan.nextInt();
	
		for(int i=1; i<=a; i++) { //세로 줄 수를 결정
			
			for(int j=0; j<i; j++) { //별 갯수(가로) 줄 수를 결정
			
				System.out.print("*");
			
			}
			System.out.println();
		}

	}

}
