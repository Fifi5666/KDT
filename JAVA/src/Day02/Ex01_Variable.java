package Day02;

public class Ex01_Variable {

	public static void main(String[] args) {
		// 변수 선언
		// - 자료형 변수명;
		
		// 변수 선언 및 초기화
		// - 자료형 변수명 = 값;
		int x;				// int형 변수 x 선언
		int y;				// int형 변수 y 선언
		
		// 여러 변수 동시에 선언
		int a, b;
		
		// 변수 선언 및 초기화
		int i = 10;
		int j = 20;
		
		// 동시 선언 및 초기화
		int m = 30, n = 40;
		
		// = (대입 연산자) 선언해둔 변수를 나중에 초기화할 수도 있다.
		x = 100;
		y = 200;
		
		// x + y
		// x, y	: 피연산자
		// +	: 연산자
		// sysout : ctrl + space
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		// 합계 // 문자열 데이터와 정수형 데이터가 만나면 문자열이 된다. + 는 연결 연산자
//		System.out.println("x + y = " + x+y);
		System.out.println("x + y = " + (x+y)); //연산자에 우선순위를 만들어준다.
		// (평균) = (합계) / (개수)
		System.out.println("(x + y) / 2 = " + (x+y)/2);
		
		// 사칙 연산 우선순위
		// *, / : 연산 우선순위 먼저
		// +, - : 연산 우선순위 나중
		

	}

}
