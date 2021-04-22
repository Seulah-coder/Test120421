package day14;

import java.util.List;
import java.util.Scanner;

public class MemberService {
	Scanner scan = new Scanner(System.in);
	
	/*
	 * 전체회원 조회를 위한 메소드
	 * 메소드 이름: view
	 * 매개변수 : memberlist
	 * 리턴 :  없음
	 */
	void view(List<MemberDTO> memberlist){
		for (int i = 0; i <memberlist.size(); i++) {
			
			System.out.println(memberlist.get(i));
		
		}
		
	
	}

	List<MemberDTO>signin(List<MemberDTO> memberlist){
		System.out.println("***로그인 페이지 입니다.***");
		System.out.println("ID: ");
		String memberID = scan.next();

		System.out.println("비밀번호: ");
		String password = scan.next();
		
		for (int i = 0; i <memberlist.size(); i++) {
			
			if (memberID.equals(memberlist.get(i).getMemberID())) {
			//선생님 코드 : if(memberID.equals(memberlist.get(i).getMemberID()) && password.equals(memberlist.get(i).getPassword()))
			// && 연산자를 이용하여 ID와 password가 일치하는지 한번에 비교
				if (password.equals(memberlist.get(i).getPassword())) {
				System.out.println(memberlist.get(i).getName() + "님 환영합니다.");
				} else {
				System.out.println("비밀번호가 틀렸습니다.");
				
		
				}
			
				} else {
					System.out.println("없는 아이디 입니다.");
				}
		}
		return memberlist;
	
	}
	
	
	List<MemberDTO>mobileupdate(List<MemberDTO> memberlist) {
		
		System.out.println("***전화번호 변경 페이지 입니다.***");
		
		System.out.println("ID: ");
		String memberID = scan.next();

		System.out.println("비밀번호: ");
		String password = scan.next();
		
		for (int i = 0; i <memberlist.size(); i++) {
			
			if (memberID.equals(memberlist.get(i).getMemberID())) {
				
				if (password.equals(memberlist.get(i).getPassword())) {
				System.out.println(memberlist.get(i).getName() + "님, 변경할 전화번호를 입력해주세요.");
				System.out.println("전화번호: ");
				String mobileNumber = scan.next();
				memberlist.get(i).setMobileNumber(mobileNumber);
				
				System.out.println(memberlist.get(i).getMobileNumber()+ "로 변경 완료 되었습니다.");
				
				} else {
				System.out.println("비밀번호가 틀렸습니다.");
		
				}
			
				} else {
					System.out.println("없는 아이디 입니다.");
				}
		}
		
		return memberlist;
	}
	
	

}
