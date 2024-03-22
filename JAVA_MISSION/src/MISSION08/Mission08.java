package MISSION08;

import java.util.Scanner;

public class Mission08 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][] = new int [N][N];
		int k = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = k++;
			}
		}
		
		for (int i = 0; i < N; i++) {
			if(i % 2 == 0) {
				for (int j = 0; j < N; j++) {
					System.out.print(arr[i][j] + " ");
				}
			}
			else {
				for (int j = N-1; j >= 0; j--) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
		
	}

}
