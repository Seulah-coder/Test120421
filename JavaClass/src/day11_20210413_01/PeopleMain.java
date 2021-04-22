package day11_20210413_01;

public class PeopleMain {

	public static void main(String[] args) {
		// PeopleMain 클래스에서 People 클래스를 
		// 객체로 만들어 활용
		String name;
		
		// People 클래스 객체 선언
		People p = new People(); 
		// People은 객체로 만들 클래스 이름 , p는 현재 파일에서 쓸 객체이름, 객채로 선언할때에는 반드시 new를 써야함. new다음에는 생성자가옴
		// 여기서 People();은 해당 클래스가 가지고 있는 생성자. 해당 클래스가 별도의 생성자를 정의하고 있지 않다면 기본 생성자를 사용함
		// 객체로 선언한 클래스가 가지고 있는 자원 (필드, 메소드 활용)
		// People 클래스가 가지고 있는 필드에 값 저장 및 출력
		
		p.name = "이름1"; // 필드를 사용할때는 변수 쓰듯이
		p.age = 10;
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.nation); // nation이라는 필드가 해당 값을 가지고있음
		//팔드값을 바꾸는것도 자유로움
		p.nation = "미국";
		System.out.println(p.nation); // people.java에 있는 내용에서 현재 클래스 23줄이 입력된 후 바뀜
		
		People p1 = new People();
		p1.name = "이름2";
		System.out.println(p1.name);
		
		People p2 = new People();
		p2.name = "이름3";
		System.out.println(p2.name);
		
		// 매개변수가 있는 생성자를 이용한 객체(인스턴스) 생성
		People p3 = new People("이름4", 30);
		System.out.println(p3.name);
		System.out.println(p3.age);
		System.out.println(p3.nation); //의 값은 출력되지 않음. 이전 생성한건 기본생성자로 생성한것이고 이후에는 값을 주지 않음
		// 이후 값을 설정하면 다시 표시됨
		p3.nation = "캐나다";
		System.out.println(p3.nation);
		p3.name = "이름 4변경";
		p3.age = 100;
		System.out.println(p3.name);
		System.out.println(p3.age);
		//매개변수로 입력받아 출력한 값도 다시 변경 가능함
		
	}

}
