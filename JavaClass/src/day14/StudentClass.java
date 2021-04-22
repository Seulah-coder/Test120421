package day14;

public class StudentClass {
	/*
	 * 접근제한자 : public, default, protected, private
	 * public : 누구나 접근 가능
	 * private : 클래스내에서만 접근이 가능함. 다른 클래스에서는 접근 불가능
	 * 			: 앞으로 필드에 붙여서 사용(다른 클래스에서 필드에 직접 접근 못하도록)
	 * 
	 */
	
	// 필드
	
	private String name;
	private String mobileNumber;
	private String address;
	
	//기본 생성자
	
	StudentClass(){
		
		
	}
	
	//모든필드를 매개변수로하는 생성자
	StudentClass(String name, String mobileNumber, String address){
		
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.address = address;
		
	}

	// name필드의 getter
	// getter의 용도 : 필드값을 가져다 쓸때
	public String getName() {
		return name;
	}
	// name필드의 setter
	// 필드값을 바꿀 때
	// 저장하고 끝나기 때문에 리턴없음
	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	// 필드는 private으로 선언하고
	// get 메소드 set메소드를 선언하여 이 메소드를 통해 필드값을 변경하고 가져오는데 활용
	// 필드에 직접접근이 아닌 간접접근
	
	
	
}
