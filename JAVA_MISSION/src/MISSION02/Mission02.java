package MISSION02;

import java.util.Scanner;

public class Mission02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int odd = 0;
		for (int i = 1; i <= N; i++) {
			if (i%2 != 0) {
				odd += i;
				System.out.print(i);
				if (i < N-1) {
					System.out.print("+");
				}
			}
		}
		System.out.println("=" + odd);
		
		int even = 0;
		for (int i = 1; i <= N; i++) {
			if (i%2 == 0) {
				even += i;
				System.out.print(i);
				if (i < N-1) {
					System.out.print("+");
				}
			}
		}
		System.out.println("=" + even);
		
		for(int i = 1; i <= N; i++) {
			if (N%i == 0) {
				System.out.print(i + " ");
			}
		}
			
	}

}
