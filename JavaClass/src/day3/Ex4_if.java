package day3;

public class Ex4_if {

	public static void main(String[] args) {
		/*
		 * 조건문 (if else, switch case)
		 * 
		 * if(condition) {
		 * 			조건이 true면 실행
		 * 
		 * } else {
		 * 			조건이 false면 실행
		 * 
		 * }
		 * 
		 * condition 자리에는 비교연산식, 논리연산식, boolean 변수, T,F 등이 올 수 있음
		 * 
		 */
		boolean con;
		con = true;
		
		System.out.println("if문 시작");
		if(con) {
			System.out.println("값이 true이기 때문에 if 부분 실행됨");
		} else {
			System.out.println("값이 false이기 때문에 else 부분 실행됨");
		}
		System.out.println("if문 끝");
	}

}
