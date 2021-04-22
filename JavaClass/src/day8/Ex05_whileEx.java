package day8;

public class Ex05_whileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		int sum = 0;
		int count = 1;
		int s = 1;
		
		boolean run = true;
		
		while(run) {
			sum = sum+num;
			if (sum >= 100) {
				run= false;
			} else {
				num = s*count;
				s=-s;
				count++;
				System.out.println("현재 num,s,count값: " + num + "," + s + ", " + count);
			}
			 System.out.println("숫자 : " + num);
			 System.out.println("합계 : " + sum);
			
		}

	}

}
