package day12;

public class MemberMain {

	public static void main(String[] args) {
		// Member 클래스 객체 선언
		// 기본 생성자를 이용한 객체
		Member m1 = new Member();
		// ↑ 클래스 이름		↑ 생성자
		
		
		//m1 field지정
		m1.id = "lee";
		m1.password = "a2b2c2";
		m1.name = "이자바";
		m1.age = 37;
		
		//호출하는 메소드의 리턴이 있는지 없는지를 구분하여 호출을 잘해야함
		
		m1.info();
		m1.update("이자바스크립트"); //이름변경
		m1.info(); //를 실행했을때 변경된 이름으로 출력됨
		m1.myName(); // 리턴이 있는 메소드는 호출할 때 
		//호출만하고 끝나면 안됨.
		//둘중에 하나 방식으로 리턴
		String name1 = m1.myName();
		System.out.println(m1.myName());
		System.out.println(name1);
		
		// 매개변수가 있는 생성자를 이용한 객체
		Member m2 = new Member("kim1","a1b1c1","김코딩",30); //결과값 질문하
		m2.info();
		m2.update("김프로그래머");
		m2.myName();
		System.out.println(m2.myName());
		

		

	}

}
