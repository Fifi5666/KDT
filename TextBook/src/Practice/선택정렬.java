package Practice;

import java.util.Scanner;

public class 선택정렬 {
	
	//선택정렬

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	        int[] arr = new int[5];
	        int n = arr.length;

	        for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				
			}
//	        System.out.println("정렬전" + Arrays.toString(arr));
	        
			for (int i = 0; i < n - 1; i++) {//한자리는 남겨둔다
				int min = i;// 최소값 저장
				for (int j = i + 1; j < n; j++) {
					if (arr[j] < arr[min])
						min = j;
				}
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
		  }	
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < i; j++) {	// (만들어진 랜덤 수 i의 전까지만! 아직 하난데 끝까지 검사할 필요x)
					// 중복이 되는 경우
					if(arr[j] == arr[i]) {
						arr[i] = arr[i+1];
						n--;// 뒤로 돌아가서 다시 뽑는다.
					}
				}
				System.out.println(arr[i] + " ");
			}
//		for (int i : arr) {
//			System.out.println("정렬후" + Arrays.toString(arr));
//		}
	 }		
	}


