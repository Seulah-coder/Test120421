package day8;

public class Ex03_Temp {

	public static void main(String[] args) {
		// 숫자(결과값)이 같은지 비교할때는 ==를 사용함
		// 문자열이 같은지 비교할 경우에는?
		
		String str1 = "가가가";
		String str2 = "나나나";
		String str3 = "가가가";
		
		if(str1.equals(str3)) {
			System.out.println("두 값이 같다.");
		} else {
			System.out.println("두 값이 다르다.");
		}
	
	}

}
