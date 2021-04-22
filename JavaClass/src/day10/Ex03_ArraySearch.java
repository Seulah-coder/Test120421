package day10;

import java.util.Scanner;

public class Ex03_ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {5, 2, 1, 3, 4, 7, 6, 9, 10, 8};
		
		Scanner scan = new Scanner(System.in);
		
		int search = 0;

		System.out.print("숫자 입력 : ");
		search= scan.nextInt();
		
		for (int i = 0; i < num.length; i++) {
			//입력받은 숫자와 배열에 있는 값을 하나하나 같은지 비교
			
			if(search == num[i]) {
				System.out.println(search + "는" + i + "번 인덱스에 있습니다.");
			
			} 

			
			
		}	
		
	}

}
