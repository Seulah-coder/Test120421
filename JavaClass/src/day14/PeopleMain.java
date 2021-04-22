package day14;

import java.util.ArrayList;
import java.util.List;

//import java.util.*; *의 의미는 자바 util의 모든 class

public class PeopleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		People human1 = new People();
		
		human1.setName("도");
		human1.setrNumber("790101 - *******");
		human1.setAddress("Japan");
		human1.setAge(41);
		
		People human2 = new People();
		
		human2.setName("모");
		human2.setrNumber("790410 - *******");
		human2.setAddress("Japan");
		human2.setAge(41);
		
		
		People human3 = new People();
		
		human3.setName("토");
		human3.setrNumber("890803 - *******");
		human3.setAddress("South Korea");
		human3.setAge(31);
		
		List<People> peoplelist = new ArrayList<People>();
		
		peoplelist.add(human1);
		peoplelist.add(human2);
		peoplelist.add(human3);
		
//		System.out.println(peoplelist.get(0).getName());
//		System.out.println(peoplelist.get(1).getName());
//		System.out.println(peoplelist.get(2).getName());
		
//		String var1 = peoplelist.get(0).getrNumber();
//		System.out.println(var1);
//		
//		String var2 = peoplelist.get(1).getrNumber();
//		System.out.println(var1);
		
		for (int i = 0; i <peoplelist.size(); i++) {
			
			System.out.println(peoplelist.get(i).getName());
			System.out.println(peoplelist.get(i).getrNumber());
			System.out.println(peoplelist.get(i).getAddress());
			System.out.println(peoplelist.get(i).getAge());
			
		}
		
		System.out.println(peoplelist.get(0)); 
		// 결과가 : day14.People@7637f22 이렇게 나옴
		
		// People클래스에서 Source -> Generate toString() 한 후 결과
		
		System.out.println(peoplelist.get(0));  
		// 결과 : People [name=도, rNumber=790101 - *******, address=South Korea, age=41]
		
		// toString을 하면 정돈된 객체의 필드값을 보여줌
		
		
		// PeopleService 클래스 객체를 ps라는이름으로 선언
		PeopleService ps = new PeopleService();
		// listPrint 메소드 호출(호출하면서 peopleList 넘김)
		System.out.println("before listPrint invoke");
		ps.listPrint(peoplelist);
		//ps는 PeopleService의 객체
		System.out.println("finish listPrint invoke");
		
		for (int i = 0; i <peoplelist.size(); i++) {
			System.out.println(peoplelist.get(i));
		}
		ps.peoplePrint(human1);
				
}

}
