package day6;

public class Ex03_For1to10Sum {

	public static void main(String[] args) {
		//1부터 10까지의 합 구하기
		//합계를 위한 변수(sum)이 필요함.
		// => sum변수에 값을 계속 누적시켜서 덧셈을 해야함.
		
		int sum = 0;
		for(int i=1; i<=10; i++) {

			sum = sum + i; // sum += i;와 같음
			
			
			if (i == 10) {
				System.out.print(i + "=" );
				
			}else {
			System.out.print(i + "+" );
			
			}
			
			//sum += 1; or sum = sum + 1;
			}
		System.out.println(sum);
		
	}

}
