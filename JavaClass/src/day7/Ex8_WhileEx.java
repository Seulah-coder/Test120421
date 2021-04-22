package day7;

public class Ex8_WhileEx {

	public static void main(String[] args) {
		/*
		 * 1단계 while문을 이용하여 1부터 10까지의 합 출력하기 
		 * 2단계 1+2+3+4+5+6+7+8+9+10 = 55 형태로 출력해보기
		 * 
		 */

		int i = 0;
		int sum = 0;

		while (i <= 10) {
			i++;

			sum += i;

			if (i == 10) {
				System.out.print(i + "=");

			} else {
				System.out.print(i + "+");

			}

		}
		System.out.println(sum);

	}

}


