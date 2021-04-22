package day14;

import java.util.ArrayList;
import java.util.List;

public class StudentMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClass student1 = new StudentClass();
	
		//private로 지정한 후 접근불가
//		student1.name = "kim";
//		student1.mobileNumber = "01133194370";
//		student1.address = "south korea";
		
		//private선언한 후에는 public에 있는 set,get을 써서 아래와 같이 작성해야함
		student1.setName("kim");
		student1.setMobileNumber("01133194370");
		student1.setAddress("south korea");
		
		//getter를 이용하여 필드값 가져오기
		String var2 = student1.getName();
		System.out.println(var2);
		System.out.println(student1.getAddress());
		
		StudentClass student2 = new StudentClass("lee", "01151223232", "south korea");
	
		// Student 객체를 ArrayList에 저장하기
		// Student 객체를 담을 수 있는 ArrayList필요
		// 담고자 하는 class 이름을 < >에 넣어줌
		List<StudentClass> stulist = new ArrayList<StudentClass>();
		
		stulist.add(student1);
		stulist.add(student2);

		// stuList의 0번 인덱스에 저장한 stu1의 name값 출력해보기
		// getter setter를 이용해서 아래 수정하기
		//System.out.println(stulist.get(0).name());
		System.out.println(stulist.get(0).getName());
		//System.out.println(stulist.get(0).name());
		System.out.println(stulist.get(1).getName());
		
		//String var 1 = stulist.get(0).name;
		String var1 = stulist.get(0).getName();
		System.out.println(var1);
		
		//stulist.get(1).name = "학생2 이름변경";
		stulist.get(1).setName("학생2이름변경");
		//System.out.println(stulist.get(1).name);
		System.out.println(stulist.get(1).getName());
	
		
	}

}
