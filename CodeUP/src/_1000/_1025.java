package _1000;

import java.util.Scanner;

public class _1025 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 10000;
		while(num != 0) {
			int spr = num / i; // 몫
			num = num % i; // 나머지에는 다음 자리수부터 남는다.
			System.out.println("[" + spr * i + "]");
			// 10으로 나눠서 다음 자리수로 넘어간다.
			i /= 10;
		}
	}

}