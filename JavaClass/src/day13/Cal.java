package day13;

import java.util.Scanner;

public class Cal {
	
	void plus (int num1, int num2) {
		
		
		System.out.println(num1 + num2);
	}
	
	void minus (int num1, int num2) {

		System.out.println(num1 - num2);
		
	}
	
	int multiplication (int num1, int num2) {
			
		int multiplication = num1 * num2;
		return multiplication;
	}
	
	int division (int num1, int num2) {
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		int division = num1 / num2;
		return division;
		
	}

}
