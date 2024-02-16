package _1000;

import java.util.Scanner;

	/**
		n이 입력되면 다음과 같은 사각형을 출력하시오.
		예)
		n 이 4 이면
		****
		****
		****
		****
	*/
public class _1352 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
				
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
