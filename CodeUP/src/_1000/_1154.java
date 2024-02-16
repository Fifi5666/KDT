package _1000;

import java.util.Scanner;

public class _1154 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b)
			System.out.println(a - b);
		else
			System.out.println(b - a);
		
		// 강사님 풀이
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int result = 0;
//		
//		if(a > b)
//			result = a - b;
//		else
//			result = b - a;
//		System.out.println(result);

	}

}
