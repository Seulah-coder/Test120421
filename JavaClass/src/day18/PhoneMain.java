package day18;

public class PhoneMain {

	public static void main(String[] args) {
		// Phone 클래스 객체
		Phone p = new Phone();
		p.company = "회사1";
		p.hangOn();
		
		// MobilePhone 클래스 객체
		MobilePhone mp = new MobilePhone();
		// MobilePhone이 가지고 있는 필드 사용
		mp.button = "버튼 10개";
		mp.message = "메시지 내용";
		
		// 여기서 상속의 특징:  MobilePhone객체로 Phone필드 사용
		mp.company = "회사2";
		mp.model = "전화기1";
		//MobilePhone클래스가 Phone클래스를 상속 받았기 때문에 가능
		
		//Phone이 가지고 있는 메소드 호출
		mp.hangOff();
		
		//재정의한 메소드를 호출하면 재정의된 내용만 실행됨. 알아서 자식클래스에 있는 것만 불러옴
		mp.hangOn();
		
		//단 부모 클래스에있는 메소드도 호출은 가능함. 이경우 자식 클래스를 거치지 않아 재정의 전 내용이 실행됨
		p.hangOn();
		
		SmartPhone sp = new SmartPhone();
		sp.company = "회사2"; // Phone의 필드
		sp.button = "터치폰"; // MobilePhone의 필드
		sp.type = "5G"; //SmartPhone의 필드
		
		sp.call("여보세요"); //phone의 메소드
		sp.hangOn(); // MobilePhone이 재정의한 메소드
		sp.hangOff(); // SmartPhone이 재정의한 메소드
	}

}
