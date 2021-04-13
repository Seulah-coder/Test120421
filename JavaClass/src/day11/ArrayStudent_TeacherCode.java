package day11;

import java.util.Scanner;

public class ArrayStudent_TeacherCode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] scores = null;
		int studentNum = 0;

		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택>");
			int select = scan.nextInt();
			
			//int[] scores = new int[studentNum];// while반복문 안에서 선언할 경우 선택창이 뜰때마다 배열은 새롭게 선언됨 
			
			if (select == 1) {
				System.out.println("학생수>");
				studentNum = scan.nextInt();
				//int[] scores = new int[studentNum]; // if안에서만 선언된 지역변수가 되어 다른곳에서 배열 사용 불가
				scores = new int[studentNum];

			} else if (select == 2) {
				// 배열에 데이터 저장
				for (int i = 0; i < scores.length; i++) {
					System.out.print((i + 1) + "번째 학생점수 : ");
					scores[i] = scan.nextInt();
				}

			} else if (select == 3) {
				//배열에 저장된 데이터 출력
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "번째 학생점수 : " + scores[i]);
				}
			} else if (select == 4) {
				// 최대값, 평균값, 내림차순 정렬
				int sum = 0, max = 0;
				double avg = 0.0;
				for (int i = 0; i < scores.length; i++) {
					
					if(scores[i]>max) {
						max = scores[i];
					}
					sum += scores[i];
				}
				avg = sum/scores.length;
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + sum/scores.length);
				
				//내림차순 정렬
				int temp = 0;
				for (int i = 0; i < scores.length; i++) {
					for (int j = i + 1; j < scores.length; j++) {
						if(scores [i] < scores[j]) {
							temp = scores[i];
							scores[i] = scores[j];
							scores[j] = temp;
							
							
						}
					}
					
				}
				// 내림차순 정렬 결과 출력
				for (int i = 0; i < scores.length; i++) {
					System.out.println(scores[i]);
				}
			} else if (select == 5) {
				run = false;
			}
			

		}

	}

}
