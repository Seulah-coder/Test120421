package day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		List<MemberDTO> memberlist = new ArrayList<MemberDTO>();
		MemberService ms = new MemberService();
		
			
		boolean run = true;

		while (run) {
			System.out.println("----------------------------------------------------");
			System.out.println("  1. 회원가입 | 2. 전체회원조회 | 3. 로그인 | 4. 전화번호변경 ");
			System.out.println("----------------------------------------------------");
			System.out.print("선택>");
			int select = scan.nextInt();

			switch (select) {
			case 1:
				
				MemberDTO member= new MemberDTO();
				
				System.out.println("***회원 가입 페이지 입니다.***");
				
				System.out.println("ID: ");
				String memberID = scan.next();
	
				System.out.println("비밀번호: ");
				String password = scan.next();
				
				System.out.println("이름: ");
				String name = scan.next();
				
				System.out.println("전화번호: ");
				String mobileNumber = scan.next();
				
				member.setMemberID(memberID);
				member.setPassword(password);
				member.setName(name);
				member.setMobileNumber(mobileNumber);
				
				memberlist.add(member);

				break;

			case 2:
				ms.view(memberlist);

				break;

			case 3:
				
				memberlist = ms.signin(memberlist);
		

				break;

			case 4:
				memberlist = ms.mobileupdate(memberlist);


				break;

			}

		}

	}
}
