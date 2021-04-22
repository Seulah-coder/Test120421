package day13;

import java.util.*;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList
		/*
		 * 
		 * Collection Framework : List, Set, Map
		 * 
		 */
		//ArrayList 선언(저장데이터 타입 : String)
		
		List<String> list = new ArrayList<String>();
		
		// < >안은 타입이 오며 왼쪽 오른쪽 동일해야함
		
		// list에 데이터 저장 : add 메소드 호출
		list.add("첫번째");
		list.add("두번째");
		list.add("세번째");
		list.add(1,"네번째");
		list.add(1,"다섯번째");
		// 그냥 배열처럼 배열 크기를 정하는 것이 아닌 넣는대로 들어감. list가 알아서 순서대로 담아줌
		
		// list에 담긴 데이터 출력할때는 get을 사용 , 숫자는 인덱스 번호를 의미함. list가 담아준걸 인덱스 번호로 출력함
		System.out.println(list.get(0)); // 인덱스 번호 0인 "첫번째"가 출력됨
		System.out.println(list.get(1)); //밀어내기 가능 list.add(1,"네번째"); 에서 1은 인덱스번호가 되어 "네번째"가 출력됨. 다시 1번을 넣고 다섯번째 list.add(1,"다섯번째");를 입력하면 "다섯번째"
		System.out.println(list.get(2)); // list.add(1,"네번째"); 입력 후 1번 인덱스에 있던 "두번째"가 밀려 2번 인덱스를 출력하면 "두번째"가 나옴 / list.add(1,"다섯번째");를 입력했기 때문에 네번째가 1번에서 밀려 2번 인덱스는 "네번째"가 출력됨
		
		// list크기 확인
		System.out.println(list.size());
		/* int java.util.List.size() // <-메소드의 소속 */
		
		// list 데이터 삭제
		list.remove(1); //1번 인덱스 데이터 지움 , 앞에 인덱스에 있는 숫자를 지우면 뒤에있는 인덱스가 당겨짐
		System.out.println(list.get(1)); // 1번인덱스에 있던 "다섯번째"가 지워지고 "네번째"가 출력 됨
		
		// for문을 이용하여 list에 담긴 모든 데이터 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		// list에 정수를 저장할 때
		List<Integer> list1 = new ArrayList<Integer>(); //Wrapper Class
		
		
	}

}
