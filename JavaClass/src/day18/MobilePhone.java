package day18;

// Phone의 자식클래스

public class MobilePhone extends Phone {
	
	// field
	String button;
	String message;
	
	//constructor
	MobilePhone(){
		
	}
	
	MobilePhone(String button){
		this.button = button;
	}
	
	// button, model, company를 매개변수로 하는 생성자
	MobilePhone(String button, String model, String company){
		this.button = button;
		this.model = model;
		this.company = company;
		// this.가 붙으면 필드. 필드는 파란색
		// model, company 필드는 상속을 받았기 때문에 MobilePhone이 가지고 있지 않아도 바로 사용 가능
	}
	
	
	// 메소드
	// 같은 이름으로 여러개의 메소드 정의가 가능함
	// 메소드 오버로딩이라고 함 :  메소드 이름은 같지만 매개변수 타입이나 갯수가 다른 것
	void sendMessage(String message) {
		System.out.println("메시지 전송 " + message);
	}
	
	void sendMessage() {
		System.out.println("매개변수가 없는 메소드");
	}
	
	void powerOn() {
		System.out.println("전원을 킵니다.");
	}
	
	// 메소드 재정의(오버라이딩)  : 상속받은 메소드의 내용을 수정하거나 바꾸는 것 
	//					  : 메소드 이름은 그대로 유지해야함
	
	
	// 메소드를 변경한 경우 @Override를 위에 써줌 (이유 : @Override를 써주면 내가 메소드를 제대로 재정의를 했는지 확인할 수 있음)
	// @가 붙으면 Annotation(어노테이션 = 주석)이라는 표시임 @를 붙이면 컴파일에서 우선적으로 확인
	
	@Override
	void hangOn() {
		System.out.println("MobilePhone으로 전화를 겁니다.");
		System.out.println("MobilePhone 전화");
	} // 부모 클래스 21번줄 메소드를 자식클래스에서 위와 같이 변경

}
