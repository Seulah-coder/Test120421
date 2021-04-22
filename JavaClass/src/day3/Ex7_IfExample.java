package day3;

import java.util.Scanner;

public class Ex7_IfExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		System.out.println("점수를 입력하세요: ");
		score = scan.nextInt();
		
		if(score >= 90) {
			System.out.println("A학점 입니다.");
		} else if(score >= 80) {
			System.out.println("B학점 입니다.");
		} else if(score >= 70) {
			System.out.println("C학점 입니다.");
		} else if(score >= 60){
			System.out.println("D학점 입니다.");
		} else {
			System.out.println("F학점 입니다.");
		}
		
		scan.close();
		
	}

}
