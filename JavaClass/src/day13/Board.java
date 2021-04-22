package day13;

public class Board {
	
	//필드 선언
	int bNumber;
	String bTitle;
	String bWriter;
	String bContents;
	
	//기본생성자
	Board(){
		
	}
	
	//모든필드를 매개변수로 하는 생성자
	Board(int bNumber, String bTitle, String bWriter, String bContents) {
		this.bNumber = bNumber;
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bContents = bContents;
		
	}
	
	//메소드 선언
	
	// 1. boardWrite 메소드
	// 글번호, 글제목, 작성자, 내용을 매개변수로 하며, 전달받은 매개변수 값을 필드에 저장
	 	void boardWrite (int bNumber, String bTitle, String bWriter, String bContents ) {
	 		
	 		this.bNumber = bNumber;
			this.bTitle = bTitle;
			this.bWriter = bWriter;
			this.bContents = bContents;
	 		
	 	}
	 	
	 	void boardView () {
	 		System.out.println(this.bNumber);
	 		System.out.println(this.bTitle);
	 		System.out.println(this.bWriter);
	 		System.out.println(this.bContents);
	 	}
	 	
	 	void boardUpdate(String bTitle, String bContents) {
	 	
	 				this.bTitle = bTitle;
					this.bContents = bContents;
					
	 	}
	

}
