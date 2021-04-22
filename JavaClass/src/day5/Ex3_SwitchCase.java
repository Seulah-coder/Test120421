package day5;

public class Ex3_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		
		switch(num) { //변수에 따라 해당 조건에 맞는 case만 실행. 만일 나머지가 조건이 맞지 않을 경우 default(기본값)을 실행함
		
		case 0 :
			System.out.println("num값이 0 이네요");
			break; // 실행이 끝나면 switch case문을 빠져나가라는 문장
		case 1 :
			System.out.println("num값이 1 이네요");
			break;
		default : 
			System.out.println("case 에서 지정한 값이 아닐 때 실행됩니다.");
			break;
		
		// String 변수도 가능
			
		
		
		}

		}

	}


