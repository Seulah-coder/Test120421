package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day14.BankDTO;
import day14.MemberDTO;
import day14.MemberService;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		BoardService bs = new BoardService();
		List<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		
		
		boolean run = true;

		while (run) {
			System.out.println("----------------------------------------------------");
			System.out.println("  1. 글쓰기 | 2. 전체글목록 | 3. 글조회 | 4. 글수정 | 5. 글삭제 ");
			System.out.println("----------------------------------------------------");
			System.out.print("선택>");
			int select = scan.nextInt();

			switch (select) {
			case 1:
				
				BoardDTO board = new BoardDTO();
				
				System.out.println("*** 글쓰기 페이지 입니다.***");
				int writeNum = boardlist.size()+1;
				
							
				System.out.println("글제목: ");
				String subject = scan.next();
	
				System.out.println("비밀번호: ");
				String password = scan.next();
				
				System.out.println("작성자: ");
				String writer = scan.next();
				
				System.out.println("내용: ");
				String writeMain = scan.next();
				
				board.setWriteNum(writeNum);
				board.setSubject(subject);
				board.setPassword(password);
				board.setWriter(writer);
				board.setWriteMain(writeMain);
				
				boardlist.add(board);

				break;

			case 2:
				//글 목록
				System.out.println("*** 전체 글 목록***");
				bs.list(boardlist);

				break;
				
			case 3:
				//글 조회
				bs.view(boardlist);
				
				break;
			case 4:
				//글 수정
				bs.revise(boardlist);
		

				break;

			case 5:
				//글 삭제
				bs.delete(boardlist);


				break;

			}

		}

	}

}
