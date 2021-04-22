package day12;

public class Member {
	
	//필드 선언
	String id;
	String password;
	String name;
	int age;
	//필드는 초기값을 안주면 String은 null, int는 0으로 자동으로 정의한다
	
	// ※생성자 : 객체 생성 방식(양식)을 결정
	//기본 생성자
	//생성자 이름: 클래스이름과 동일함
	Member(){
	
		
	}
	//모든 필드를 매개변수로 하는 생성자
	Member(String id, String password, String name, int age) {
		//매개변수로 받은 값을 각각 필드에 저장 (this가 붙으면 field다)
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		
	}
	
	// 메소드 선언
	void info( ) {
		//모든 필드값(id, password, name,age를 출력하는 내용을 가지고 있는 메소드(리턴 없음, 매개변수 없음)
		System.out.println(this.id + this.password + this.name + this.age);
	}
	
	// update 메소드(리턴 없음, 매개변수 있음)
	void update(String name) {
		//name 필드값을 수정하는 메소드
		// name을 매개변수로 받아서 그 값을 필드에 저장
		
			this.name = name;
	
		
	}
	
	// myName 메소드
	
	String myName() {
		//name필드값을 리턴해주는 메소드(리턴 있음, 매개변수 없음)

		return this.name;
	}

}
