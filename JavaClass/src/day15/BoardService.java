package day15;

import java.util.List;
import java.util.Scanner;


public class BoardService {
	Scanner scan = new Scanner(System.in);

	void list(List<BoardDTO> boardlist) {

	

		for (int i = 0; i < boardlist.size(); i++) {

			System.out.println(boardlist.get(i));

		}

	}
	
	
	
	void view(List<BoardDTO> boardlist){
		
		System.out.println("글번호를 입력하세요: ");
		int writeNum = scan.nextInt();

		for (int i = 0; i < boardlist.size(); i++) {

			if (writeNum == boardlist.get(i).getWriteNum())
			System.out.println(boardlist.get(i).getWriteMain());

		}		
		
	
	} 
	
	
	

	void revise(List<BoardDTO> boardlist) {
		System.out.println("글번호: ");
		int writeNum = scan.nextInt();
		System.out.println("비밀번호: ");
		String password = scan.next();


		for (int i = 0; i < boardlist.size(); i++) {

			if (writeNum == boardlist.get(i).getWriteNum() && password.equals(boardlist.get(i).getPassword())) {

			System.out.println("수정할 제목: ");
			String subject = scan.next();
			boardlist.get(i).setSubject(subject);

			System.out.println("수정할 내용: ");
			String writeMain = scan.next();
			boardlist.get(i).setWriteMain(writeMain);

			System.out.println(boardlist.get(i));

			} else {

				System.out.println("비밀번호와 글번호가 틀렸습니다.");
			}

		}
		
	}

	void delete(List<BoardDTO> boardlist) {
		System.out.println("글번호: ");
		int writeNum = scan.nextInt();
		System.out.println("비밀번호: ");
		String password = scan.next();


		for (int i = 0; i < boardlist.size(); i++) {

			if (writeNum == boardlist.get(i).getWriteNum() && password.equals(boardlist.get(i).getPassword())) {

				boardlist.remove(i);

			} else {

				System.out.println("비밀번호가 틀렸습니다.");
			}

		}

	}
}


