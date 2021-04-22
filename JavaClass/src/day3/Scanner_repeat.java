package day3;

import java.util.Scanner;

public class Scanner_repeat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		String address = "";
		int age = 0;
		
		System.out.println("이름을 입력하세요: " + name);
		scan.nextLine();
		
		System.out.println("주소를 입력하세요: " + address);
		scan.nextLine();
		
		System.out.println("나이를 입력하세요: " + age);
		scan.nextInt();
		
		System.out.println("스캐너로 입력한 name: " + name);
		System.out.println("스캐너로 입력한 address: " + address);
		System.out.println("스캐너로 입력한 age: " + age);
		
		scan.close();

	}

}
