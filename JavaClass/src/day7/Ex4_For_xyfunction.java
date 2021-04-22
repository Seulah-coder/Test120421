package day7;

public class Ex4_For_xyfunction {

	public static void main(String[] args) {
		/*
		 * 4x + 5y = 60를 만족하는 x,y값을 출력하시오. (단, x,y는 0보다 크도 10보다 작은 정수)
		 */

		for (int x = 1; x <= 10; x++) {

			for (int y = 1; y <= 10; y++) {

				int result = (x * 4) + (y * 5);
				if (result == 60) {

					System.out.println("(" + x + "," + y + ")");
				}

			}
		}

	}

}
