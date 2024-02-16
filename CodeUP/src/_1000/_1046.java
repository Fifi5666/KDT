
package _1000;

import java.util.Scanner;

public class _1046 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
//		float e = (a + b + c) / 3;
		
		System.out.println(a + b + c);
		System.out.printf("%.1f", (a + b + c) / 3f);
		
		// printf는 출력할 데이터의 포맷을 지정하여 출력하는 출력문입니다.
		// .숫자 : 다음의 숫자는 소수점 아래 표현할 자리수를 의미합니다.
		// f는 표현할 데이터의 형식입니다. float는 실수형을 나타냅니다. 정수는 %d
		
//		System.out.println(Math.round(((a + b +c) / 3.0)*10)/10.0);
//		System.out.println((float)Math.round(((a + b +c) / 3.0)*10)/10);

	}

}
