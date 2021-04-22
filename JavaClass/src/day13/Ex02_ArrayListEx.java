package day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02_ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * ArrayList에 영어로 된 단어 5개를 스캐너로 입력받고
		 * 입력받은 단어를 모두 출력하고
		 * 마지막에는 가장 긴 단어를 출력하세요.
		 *  
		 * 
		 */
		
		// 입력을 받고 for를 3개 써서 
		// firststep : 반복문에서 입력만 먼저 받기
		
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		String word = " ";
		
		

		//단어입력하기
		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter the words  : ");
			word= scan.nextLine();
			list.add(word);
			
			// list.add(scan.next()); 위 두줄을 한줄로 만드는 것도 가능
		}
	
		//단어출력하기
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		//가장 긴 단어찾기
		int longword = 0; // 단어길이가 가장 긴 데이터가 저장된 인덱스를 가져오기위한 변수
	
		for(int i = 1; i < list.size(); i++) {
			
			if (list.get(longword).length() < list.get(i).length()){
				longword = i;
				
			}
			
		}
		
		
		System.out.println("The longest word is : " + list.get(longword));
		
		
		
		
	}

}
