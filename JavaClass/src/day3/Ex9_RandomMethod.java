package day3;

public class Ex9_RandomMethod {

	public static void main(String[] args) {
		// Random 메소드
		// 특정 범위 내에서 숫자를 하나 출력해주는 메소드
		// 1~10 사이에 숫자 하나를 무작위로 발생
		/* (int)(Math.ramdom() * 10) + 1
		 * random() 0보다 크거나 같고 1.0보다 작은 숫자를 발생시킴
		 * 
		 */
		System.out.println(Math.random());
		System.out.println(Math.random()*10);
		System.out.println((int)(Math.random()*10));
		System.out.println(((int)(Math.random()*10)+1)); // 강제 형변환 
		
		//+1을 더하는 이유는 0~9까지의 숫자가 나오기 때문에 1~10까지 범위의 숫자는 +1을 더해서 출력
		
		System.out.println(((int)(Math.random()*45)+1)); // 1~45숫자 중 하나 출력하는 코드

	}

}
