package Day03;

import java.util.Scanner;

public class Ex07_SwitchBreak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		
		// 입력 받은 정수를 5로 나눈 나머지가
		// 2보다 작으면 "*" 출력
		// 그렇지 않으면 "**" 출력
		// - switch문을 사용하여 작성하시오.
		
		switch ( a % 5 ) { // 나머지의 경우의 수는 5(0,1,2,3,4)
			case 0	: System.out.println("*"); break;
			case 1	: System.out.println("*"); break;
			case 2	: System.out.println("**"); break;
			case 3	: System.out.println("**"); break;
			case 4	: System.out.println("**"); break;
		}
		
		//
		switch ( a % 5 ) { // 나머지의 경우의 수는 5(0,1,2,3,4)
			case 0	: 
			case 1	: System.out.println("*"); break;
			case 2	: 
			case 3	: 
			case 4	: System.out.println("**"); break; // 같은 실행문일 때 마지막에만 적을 수 있다.
	}
		sc.close();
	}

}
