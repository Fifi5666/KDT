package _1000;

import java.util.Scanner;

public class _1353 {

	/**
		n이 입력되면 다음과 같은 삼각형을 출력하시오.
		예)
		n 이 5 이면
		*
		**
		***
		****
		*****
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// 바깥쪽 반복문 : 행(i)
		for(int i = 1; i <= n; i++) {
			// 안쪽 반복문 : 열(j)
			for(int j = 1; j <= i; j++) {
				// 몇 번 째 줄(i)이냐에 따라 *(j)가 i만큼 반복됨
				// ex) 1번째 줄에는 별이 1개...3번째 줄에는 별이 3개
				System.out.print("*");	
			}
			System.out.println();
		}

	}

}
