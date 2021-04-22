package day11;

import java.util.Scanner;

public class Ex01_ArrayStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] score = null;

		int studentnumber = 0;

		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택>");
			int select = scan.nextInt();

			

				switch (select) {
				case 1:
					System.out.println("학생수>");
	
					studentnumber = scan.nextInt();
					score = new int[studentnumber];

					break;

				case 2:
					for (int i = 0; i < score.length; i++) {
					System.out.print((i + 1) + "번째 학생점수 : ");
					score[i] = scan.nextInt();
					}
					break;
					
				case 3:
					for (int i = 0; i < score.length; i++) {
					System.out.println((i + 1) + "번 째 학생점수 : " + score[i]);
					}
					break;

				case 4:
					int sum = 0;
					int avg = 0;
					int max = 0;
					for (int i = 0; i < score.length; i++) {
					sum += score[i];
					avg = sum/score.length;
					
					if(score[i] > max) {
						max = score[i];
					}
					
					}
					System.out.println("평균점수 : " + avg);
					System.out.println("최대점수 :" + max);
									
					int temp = 0;
					for (int i = 0; i < score.length; i++) {
						
							for (int j = i + 1; j < score.length; j++) {
								
								if (score[i] < score[j]) { 
									temp = score[i]; 
									score[i] = score[j]; 
									score[j] = temp; 
								}
							}
						}
					for (int i = 0; i < score.length; i++) {
						System.out.println(score[i]);
					}
					break;
					
				case 5:
					System.out.println("종료합니다.");
					run = false;
				}
		}

	}

}

