package _1000;

import java.util.Scanner;

public class _1355 {
	/*
	 	길이 n이 입력되면 다음과 같은 역삼각형을 출력한다.
		예) n이 5이면
		*****
		 ****
		  ***
		   **
		    *
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = n; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
