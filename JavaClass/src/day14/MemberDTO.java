package day14;

public class MemberDTO {
	
	
	private String memberID;
	private String password;
	private String name;
	private String mobileNumber;
	
	MemberDTO(){
		
	}
	
	MemberDTO(String memberID, String password, String name, String mobileNumber) {
		
		this.memberID = memberID;
		this.password = password;
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
	
	
	
	@Override
	public String toString() {
		return "MemberDTO [memberID=" + memberID + ", password=" + password + ", name=" + name + ", mobileNumber="
				+ mobileNumber + "]";
	}

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}
