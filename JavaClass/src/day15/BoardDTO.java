package day15;

public class BoardDTO {
	
	private int writeNum;
	private String subject;
	private String password;
	private String writer;
	private String writeMain;
	
	
	
	BoardDTO(){
		
	}
	
	BoardDTO(int writeNum, String subject, String password, String writer, String writeMain){
		
		this.writeNum = writeNum;
		this.subject = subject;
		this.password = password;
		this.writer = writer;
		this.writeMain = writeMain;
		
		
	}
	
	
	@Override
	public String toString() {
		return "BoardDTO [writeNum=" + writeNum + ", subject=" + subject + ", password=" + password + ", writer="
				+ writer + ", writeMain=" + writeMain + "]";
	}

	public int getWriteNum() {
		return writeNum;
	}

	public void setWriteNum(int writeNum) {
		this.writeNum = writeNum;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getWriteMain() {
		return writeMain;
	}

	public void setWriteMain(String writeMain) {
		this.writeMain = writeMain;
	}
	
	

}
