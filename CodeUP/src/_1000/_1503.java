package _1000;

import java.util.Scanner;

public class _1503 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][] = new int[N][N];
		int k = 1; 
		int k2 = N*N;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
			}
			else {
				for (int j = arr[i].length - 1; j >= 0; j--) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
		
	}

}
