package Day02;

public class Ex15_TernaryOperator {

	public static void main(String[] args) {
		int a = 3, b = 5;
		
		// a와 b 두 수의 차이(절대값)를 구하시오.
		// a - b = -2
		// b - a = 2
		
		// 음수가 발생하지 않게 하는 법
		int result = (a > b) ? a-b : b-a;
		System.out.println("두 수의 차 : " + result);
		
		// 조건 연산자를 if문으로 쓰면
		if( a > b )
			result = a-b;
		else
			result = b-a;
		System.out.println("result : " + result);

	}

}
