package _1000;

import java.util.Scanner;

public class _1356 {
	/*
	 	길이 n이 입력되면 다음과 같은 사각형을 출력한다.
		예) n이 5일때
		*****
		*   *
		*   *
		*   *
		*****
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			// 맨 첫 줄과 끝 줄은 꽉 채운 *
			if(i == 0 || i == n - 1)
			for(int j = 0; j < n; j++) {
				System.out.print("*");
			}
			else {
				// 매 행마다 첫 번째 열은 *을 찍는다.
				System.out.print("*");
				// 마지막 열을 제외하고 공백
				for(int j = 0; j < n - 2; j++) {
					System.out.print(" ");
				}
				// 마지막에 다시 *을 찍는다.
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
