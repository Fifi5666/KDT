package Practice;

public class Q04_01_If {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		int result = 0;
		
		if (operator == '+') {
			result = num1 + num2;
		}
		else if (operator == '-') {
			result = num1 - num2;
		}
		else if (operator == '*') {
			result = num1 * num2;
		}
		else if (operator == '/') {
			result = num1 / num2;
		}
		else {
			System.out.println("잘못된 연산자입니다.");
			return;
		}
		System.out.println(result);
	}

}
