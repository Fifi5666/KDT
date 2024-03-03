package MISSION07;

import java.util.Scanner;

public class Mission07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 입력한 값 배열에 저장하기
		int score[] = new int[5];
		for (int i = 0; i < score.length; i++) {
			int scores = sc.nextInt();
			score[i] = scores;
		}
		
		// 선택정렬 - 오름차순
		for (int i = 0; i < score.length; i++) {
			for (int j = i+1; j < score.length; j++) {
				if(score[i] > score[j]) {
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		
		System.out.println();
		
		// 선택정렬 - 내림차순
		for (int i = 0; i < score.length; i++) {
			for (int j = i+1; j < score.length; j++) {
				if(score[i] < score[j]) {
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
	}

}
