package day8;

import java.util.Scanner;

public class Input_String {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 '종료'를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String inputString = "";
		
		boolean run = true;
		
		do {
			 System.out.println(">");
			 inputString = scan.nextLine();
			 System.out.println(inputString);
			 
			 if(inputString.equals("종료")) 
				 run = false;
			 
		}while(run);
		System.out.println();
		System.out.println("프로그램 종료");
		
		scan.close();
	}

}
