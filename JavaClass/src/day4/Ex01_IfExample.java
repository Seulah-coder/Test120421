package day4;

import java.util.Scanner;

public class Ex01_IfExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int score = 0;
		System.out.println("점수를 입력하세요: ");
		score = scan.nextInt();

		String grade = "초기값";

		if (score <= 100) {
			if (score >= 95) {
				grade = "A+";
			} else if (score >= 90) {
				grade = "A";
			} else if (score >= 85) {
				grade = "B+";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 75) {
				grade = "C+";
			} else if (score >= 70) {
				grade = "C";
			} else if (score >= 65) {
				grade = "D+";
			} else if (score >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}
			System.out.println(grade + "학점 입니다");

		} else {
			System.out.println("입력범위초과!!");
		}

		scan.close();

	}
}
