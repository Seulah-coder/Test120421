package day6;

public class Ex02_ForEx {

	public static void main(String[] args) {
		
		//1. 1 부터 10까지 출력
		//2. 1 부터 10까지 중에서 2,4,6,8,10만 출력
		//3. 1부터 10까지 중에서 1,3,5,7,9만 출력

		for(int  i=1; i<=10; i++) {
			System.out.println(i);
		}
		for(int  i=2; i<=10; i+=2) {
			System.out.println(i);
		}
		for(int  i=1; i<=10; i+=2) {
			System.out.println(i);
		}
	} 

}
