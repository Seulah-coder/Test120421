package day7;

public class Ex1_ForEx {

	public static void main(String[] args) {
		//10부터 1까지 출력하기
		
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		//중첩 for문
		System.out.println("i for문 시작");
		for(int i=1; i<=2; i++) {
			System.out.println("j for문 시작");
			for(int j=1; j<=3; j++) {
				System.out.print("i값 : " + i);
				System.out.println(", j값 :" + j);
			}
			//System.out.println(j);은 사용불가. for문에 사용된 j는 지역변수이기 때문에 {}안에서만 움직임
			int j = 0; //지역변수(Local Variable) 전역변수(Global Variable)
			System.out.println("j for문 끝");
			
		}
		System.out.println("i for문 끝");

	}

}
