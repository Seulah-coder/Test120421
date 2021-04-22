package day7;

public class Ex2_MultiTable {

	public static void main(String[] args) {
		// 구구단 출력
		// 1단계 (2~9단까지 한줄에 출력)

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "x" + j + "=" + i * j);
			}
		}

		System.out.println();
		System.out.println();
		
		// 2단계 (단별로 한줄에 출력)
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "x" + j + "=" + i * j);

			}
			System.out.println();

		}
		
		System.out.println();
		
		//3단계 (단별로 한줄에 출력되고 깔끔하게)
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "x" + j + "=" + i * j + "\t");
				
			}
			System.out.println();

		}

	}
}
