package day18;

public class TryCatch_01 {

	public static void main(String[] args) {
		/*
		 * 예외(Exception) 처리
		 * 
		 * 어떠한 예외가 발생 하면 이렇게 처리를 하겠다고 명령하는것 
		 * try catch라는 문법을 사용
		 * 구조 :
		 * try {
		 * 		실행할 내용
		 * 
		 * 
		 * } catch(예상되는 exception이름 e) {
		 * 	해당 예외(exception)가 발생할 경우 실행할 내용
		 * }
		 * 
		 */
		
		
		
		try {
			int[]num = new int[3];
			num[2] = 10;
			
			System.out.println("try 마지막줄");
		
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열크기 초과");
			e.printStackTrace();
		} finally {
			System.out.println("예외가 나든 안나든 무조건 여기는 나옵니다.");
		}
		
		System.out.println("try catch 끝나고");
		

	}

}
