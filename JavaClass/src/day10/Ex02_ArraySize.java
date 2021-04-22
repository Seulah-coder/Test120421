package day10;

import java.util.Scanner;

public class Ex02_ArraySize {

	public static void main(String[] args) {
		//배결의 크기를 스캐너를 통해 지정하기
		Scanner scan = new Scanner(System.in);
		
		int[] num = null;
		
		System.out.println("배열 크기: ");
		int size = scan.nextInt();
		
		num = new int[size]; // []에는 숫자뿐만이 아니라 문자도 들어감. size를 선언해서 입력을 받고 입력받은 숫자만큼 배열 크기 지정이 가능함
		System.out.println("배열 크기 확인");
		System.out.println(num.length);

	}

}
