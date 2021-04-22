package day3;

public class Ex5_If {

	public static void main(String[] args) {
		int a=0, b=0;
		a = 50;
		b = 50;
		
		if(a > b && a > 0) { // a가 b보다 크고, 0보다 클때
			// num1이 num2보다 클 때 이 부분이 실행
			System.out.println("A가 큽니다.");
			
		} else {
			// num2가 num1보다 클 때 이 부분이 실행
			// num2가 num1과 같을 때에도 실행
			System.out.println("B가 큽니다.");
		}

	}

}
