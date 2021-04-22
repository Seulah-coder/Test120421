package day5;

import java.util.Scanner;

public class Ex4_SwitchDictionary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = " ";
		
		System.out.print("단어를 입력하세요 :");
		str = scan.nextLine();
	
		
		switch (str) {
		
		case "desk" :
			System.out.println("책상입니다.");
			break;
			
		case "chair" : 
			System.out.println("의자입니다.");
			break;
			
		case "monitor" :
			System.out.println("모니터입니다.");
			break;
			
		default : 
			System.out.println("사전에 없는 단어 입니다.");
			break;
		
		}
		
		scan.close();

	}

}
