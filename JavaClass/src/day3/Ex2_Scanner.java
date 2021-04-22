package day3;

//라이브러리를 사용할 때
import java.util.Scanner;

public class Ex2_Scanner {

	public static void main(String[] args) {
		//스캐너 기능을 사용하기 위한 스캐너 객체 선언
		Scanner scan = new Scanner(System.in);
		String name = "초기값", address = "초기값";
		int age = 0;
		System.out.println("스캐너 입력전 name: " + name);
		
		System.out.print("이름을 입력하세요: ");
		name = scan.next(); // 스캐너 클래스에서 제공하는 next() 메소드를 이용하여 
		// String 값을 입력받을 수 있음.
		// 이 입력한 값을 name 변수에 대입하는 문장 
		// 여기서는 println이 아닌 print사용(println의 경우 입력 커서가 다음 라인으로 배치됨)
		scan.nextLine();
		
		System.out.println("스캐너로 입력한 name: " + name);
		//System.out.println("스캐너 입력전 address: " + address);
		
		System.out.println("주소를 입력하세요: ");
		address = scan.nextLine();
		System.out.println("스캐너로 입력한 address: " + address);
		
		System.out.println("스캐너 입력전 age: " + age);
		
		System.out.println("나이를 입력하세요: ");
		age = scan.nextInt();
		System.out.println("스캐너로 입력한 age: " + age);
		
		scan.close(); //스캐너 객체를 종료하는 close() 메소드
	}

}
