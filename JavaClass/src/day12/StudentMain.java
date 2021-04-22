package day12;

public class StudentMain {

	public static void main(String[] args) {
		//기본생성자를 이용한 객체선언
		// constructor :생성자
		
		Student stu1 = new Student(); 
		
		stu1.name = "김";
		stu1.stuNum = 20210414;
		
		System.out.println(stu1.name);
		System.out.println(stu1.stuNum);
		
		System.out.println();
		
		Student stu2 = new Student("이", 20210413);
		//학번과 이름을 바꾸어쓸경우 (String과 int바꾸어 쓸경우) 이미 필드에서 순서를 (String,int로 지정했기 때문에 오류발생)
		//다시 순서를 바꿔 필드에서 정의해 주면 순서 바뀌어도 사용 가능 Student field에 34-38번 참고
		System.out.println(stu2.name);
		System.out.println(stu2.stuNum);
		
		System.out.println();
		
		System.out.println("메소드 호출전");
		
		// fieldPrint 메소드 호출
		stu1.fieldPrint();
		
		System.out.println("메소드 호출끝");
		
		stu2.fieldPrint();
		
		Student stu3 = new Student("학생3",22222);
		stu3.fieldPrint();
		//리턴이 없는 메소드는 호출만하고 끝날때가 많음
		
		System.out.println("리턴있는 메소드 호출");
		// 리턴이 있는 메소드를 호출할 때는 호출만하고 끝나는 것이 아니라 
		// 리턴값을 활용하는 내용이 필요
		stu1.numberMethod();
		
		int aa = 0;
		System.out.println(aa); //메소드 호출 전
		aa = stu1.numberMethod();
		System.out.println(aa); //메소드 호출 후
		
		System.out.println(stu2.numberMethod());
		
		System.out.println("String 메소드호출");
		System.out.println(stu3.stringMethod());
		
		String bb = stu3.stringMethod();
		System.out.println(bb);
		
		Student stu4 = new Student();
		int cc = stu4.numberMethod2(30); //int numberMethod2(int num1) 형태로 똑같이 입력해야함 ()괄호안에 int숫자도 입력해야함
		System.out.println(cc); // cc의 값은 40 이유는? 
		//30의 숫자가 int num1에 들어감, int num2 = 10;이기 때문에 10 + 30 = 40이 됨
		
		int number1 = 50;
		cc = stu4.numberMethod2(number1);
		System.out.println(cc);
	}

}
