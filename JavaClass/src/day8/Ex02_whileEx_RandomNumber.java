package day8;

public class Ex02_whileEx_RandomNumber {

	public static void main(String[] args) {
		 
		boolean run = true;
		while(run) {
			int num1 = (int)(Math.random()*6)+1;
			
			int num2 = (int)(Math.random()*6)+1;
			System.out.println("(" + num1 + "," + num2 + ")");
			
			if(num1 + num2 == 5) {
				System.out.println("주사위 1과 주사위 2의 합이 5가 나오면 종료됩니다");
				
				run = false; 
			}
			
		}

	}

}
