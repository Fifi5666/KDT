package Day04;

import java.util.Scanner;

public class Ex02_Max {

	public static void main(String[] args) {
		// 첫째 줄에 입력할 개수 N 입력받고,
		// 둘째 줄에 N 개의 정수를 공백을 두고 입력받으시오.
		// N 개의 정수 중, 최댓값을 출력하시오.
		// (입력 예시)
		// 5
		// 90 60 70 100 55
		// (출력 예시)
		// 최댓값 : 100
		/*
		 	(순서도)
		 	1. 정수 하나를 입력받는다.
		 	2. 입력받은 정수를 변수 N에 대입한다.
		 	3. N번 반복하여 N개의 정수를 입력받는다.
		 	4. 입력받은 N개의 정수를 배열 arr에 저장한다.
		 	5. 배열 arr을 반복하여, 최댓값 변수 max와 i번째 요소를 비교한다.
		 	6. 두 요소 중 더 큰 요소를 max에 대입한다.
		 	7. 반복이 끝나고, 변수 max를 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();			// 1번	// 입력받을 데이터 개수
		int arr[] = new int[N];			// 2번
		// 최댓값 선언 : 첫 번째 배열 요소와 크기를 비교하기 위해서는 max의 초기값을 선언해야 한다(값이 없으면 비교를 할 수 없으니까)
		int max = Integer.MIN_VALUE;			// int 타입의 최솟값
		
		// 반복 변수 i : 0,1,2,3,4
		for(int i = 0; i < N; i++) {	// 3번
			arr[i] = sc.nextInt();		// 4번
		}
		
		// 5번
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];			// 6번	// 배열의 0번째부터 가장 작은 max와 비교하여 더 큰 값이 max가 된다.
			}
		}
		
		// 7번
		System.out.println("최댓값 : " + max);
		sc.close();

	}

}
