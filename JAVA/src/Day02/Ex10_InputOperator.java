package Day02;

import java.util.Scanner;

public class Ex10_InputOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// (바로 엔터) : shift + enter
		
		System.out.print("x : ");
		int x = sc.nextInt();
		
		System.out.print("y : ");
		int y = sc.nextInt();
		
		System.out.print("z : ");
		int z = sc.nextInt();
		
		// 합계, 평균
		int sum = x + y + z;
		double avg = sum / 3; // 몫(3)만 나오고 나머지(2)는 안 나옴
		// (double) = (int) / (int);
		// int는 정수 자료형으로, 실수의 소수 부분을 표현할 수 없다.
		
		// (큰 자료형) + (작은 자료형) = (큰 자료형)
		// - 서로 다른 자료형 연산 시, 결과는 큰 자료형으로 변환된다.
		
		// 강제 형변환 : (자료형) 변수
		double realAvg = (double) sum / 3; // sum을 int에서 double로 강제 형변환
		double realAvg2 = sum / 3.0; // sum은 int지만 3.0은 double이므로 결과도 double
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("평균1 : " + realAvg);
		System.out.println("평균2 : " + realAvg2);
		// avg 평균 변수가 정수형(int)이라서 소수 부분을 표현할 수 없다.
		// 평균을 소수점까지 표현하기 위해서는 실수형(double)로 변환해야 한다.
		
		sc.close();
	}

}
