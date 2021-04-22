package day5;

import java.util.Scanner;

public class Ex1_IfExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int grade,score;
		System.out.print("학년을 입력하세요 :");
		grade = scan.nextInt();
		System.out.println("점수를 입력하세요 : ");
		score = scan.nextInt();
		
		if(grade < 4) {
			if (score >= 60) { // {}블록이라고도 부름 
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} else if (score >= 70) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		/*
		 * 선생님 코드
		 * 
		 * if(score > = 60) {
		 *   점수가 60이상
		 *   if(year !=4) {
		 *     //점수가 60이상이고 학년은 1,2,3
		 *    System.out.println("합격");
		 *    }else if(score >=70) {
		 *     //학년은 4이고 점수가 70이상
		 *    System.out.println("합격);
		 *    }else{
		 *    System.out.println("불합격");
		 *    }
		 *  }else{
		 *  	System.out.println("불합격");
		 * }
		 * 
		 * 
		 */
		scan.close();

	}

}
