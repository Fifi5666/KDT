package Day03;

public class Ex09_WhileSum {

	public static void main(String[] args) {
		// 1부터 100까지의 합계를 구하시오.
		// 1+2+3+4+...+100 = 5050
		int a = 1;
		int sum = 0;
		
		// 반복 조건 : a가 100이하, 100을 초과하면 반복문 블록을 탈출하여 실행문을 실행한다.
		while( a <= 100 ) {
			sum = sum + a++;
			// 1. sum += a++;
			// 2. sum = sum + a;
			//    a = a + 1;
		}
		System.out.println("합계 : " + sum);

	}

}
