package Day03;

public class Ex08_While {

	public static void main(String[] args) {
		// 1~10 까지 공백을 두고 출력하시오.
		int a = 1;
		
		// while(조건) {반복 실행문}
		while( a <= 10 ) {
			System.out.print(a + " ");
			a = a + 1;
		}
		// 증감 연산자를 활용하여 코드를 줄일 수 있다.
		// 반복문에는 반드시 종료 조건이 성립하도록 작성해야 한다.
		// 종료 조건을 만족하지 않게 되면, 무한루프에 빠진다.
		while( a <= 10 ) {
			System.out.print(a++ + " ");
		}

	}

}
