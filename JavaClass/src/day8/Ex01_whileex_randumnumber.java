package day8;

public class Ex01_whileex_randumnumber {

	public static void main(String[] args) {
		//주사위 게임(프로그램을 실행했을 때 숫자가 6이 나오면 종료 되는 프로그램)
		
		boolean run = true;
		while(run) {
			int num = (int)(Math.random()*6+1);
			System.out.println("숫자:" + num);
			// num이 6이면 반복문 종료
			
			if(num == 6) {
				System.out.println("6이 나오면 종료됩니다.");
				run = false;
			}
			
		} System.out.println("반복문 종료됨");

	}

}
