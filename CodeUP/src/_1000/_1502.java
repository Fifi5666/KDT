package _1000;

/*
	n이 입력되면 크기가 n인 다음과 같은 2차원 배열을 출력하시오.

	입력 예)
	3
	출력 예)
	1 4 7
	2 5 8
	3 6 9
*/
import java.util.Scanner;

public class _1502 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][] = new int[N][N];
		int k = 1; 
		
		// 1~N 증가하는 값을 입력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[j][i] = k++;
				// 행, 열 중 어느 방향으로 숫자가 커지는지 위치를 바꿀 수 있다.
			}
		}
		
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
