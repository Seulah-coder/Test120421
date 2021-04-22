package day13;

public class BoardMainClass {

	public static void main(String[] args) {
		// 두가지 생성자를 이용한 객체를 각각 선언하고 메소드 3가지를 각각 호출
		
		Board book1 = new Board();
		
		// field 지정
//		book1.bNumber = 14003579;
//		book1.bTitle = "초보자가 배우는 자바";
//		book1.bWriter = "김프로그래머";
//		book1.bContents = "10일만에 자바를 배울수있어요";
		
		book1.boardWrite(14003579, "초보자가 배우는 자바", "김프로그래머", "10일만에 자바를 배울수있어요");
		book1.boardView();
		book1.boardUpdate("중급자가 배우는 자바", "한달만에 자바를 배울수있어요");
		book1.boardView();
				
		// 매개변수가 있는 생성자를 이용한 객체
		
	
		
	}

}
