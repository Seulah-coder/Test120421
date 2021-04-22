package class1;

public class Variables {

	public static void main(String[] args) {
		// 변수 <-> 상수
		// 변수 : 어떠한 값을 담는 공간
		// 사용자가 입력한 값을 변수에 담아서 computer에 전달 함.
		// computer는 변수에 담긴 값을 확인하고 해당하는 처리를 하게 됨
		// 변수를 사용하기 위해서는 선언을 하고 값을 담는 과정이 필요.
		// 변수 선언시 변수타입, 변수 이름이 필요함.
		
		/*
		 * 변수선언 연습
		 * 1.변수타입: 정수형(음수, 0, 양수)
		 * 2.변수이름: number1
		 */
		
		int number1;
		// 변수에 값 저장
		// 프로그래밍 언어에서의 = 은 무조건
		// 우변에 있는 값을 좌변에 대입한다는 의미
		// 변수를 선언한다는 것은 컴퓨터 메모리상에 값을 담을 수 있는 공간을 만든다 라는 의미
		// 선언 : Declaration 초기화 : initialization 
		number1 = 10;
		System.out.println(number1);
		// 변수에 다른 값을 대입하면 이전에 있던 값은 사라짐
		number1 = 20;
		System.out.println(number1);		
		/*
		 * 변수 이름 작성시 유의사항
		 * 의미없는 문자는 되도록 지양(a,b,abc,aaa 등)
		 * 숫자로 시작하거나 숫자만으로 쓰지는 않음
		 * 변수는 기본 영어 소문자를 사용하며 시작도 소문자임
		 * 두 단어 이상의 조합시
		 * studentNumber,studentName등 시작은 소문자, 다음 단어는 대문자 사용 or
		 * student_number,student_name 등으로 사용
		 */
		
		
		/*
		 * 변수 타입
		 * 1. 정수형 변수 (크기(메모리크기))
		 * 		byte
		 * 		short
		 * 		int(4byte) 정수를 다룸
		 * 		long(8byte) 값이 큼
		 * 		char
		 * 2. 실수형 변수
		 * 		float(4byte)
		 * 		double(8byte)
		 * 3. 논리형 변수
		 * 		boolean : true,false
		 * 4. 문자열 변수
		 * 		String(앞에 문자가 대문자임)
 		 */
		
		//변수 선언(선언과 동시에 값 지정 가능)
		int intVar = 10;
		long longvar = 99999999999999999L; // long type 변수는 반드시 숫자 끝에 L(대문자)를 붙여줘야함
		float floatVar = 1.23456f;
		double doubleVar = 1.231313545324324;
		boolean boolVar = false;
		String strVar = "아무거나 써도 들어감";
		//(단 String의 경우더블쿼터 " " 로 묶어줘야함)
		

	}

}
