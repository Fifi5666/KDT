package _1000;

import java.util.Scanner;

public class _1226 {

	public static void main(String[] args) {
		// 당첨번호(6자리+보너스) 7자리, 내 번호 6자리 입력
		Scanner sc = new Scanner(System.in);
		
		int num[]= new int[7];
		for (int a = 0; a < num.length; a++) {
			num[a] = sc.nextInt();
		}

		int myNum[] = new int[6];
		for (int b = 0; b < myNum.length; b++) {
			myNum[b] = sc.nextInt();
		}
		
		int c = 0;
		
		// 6개 비교 (마지막 자리는 보너스 번호니까 비교하지 않기 위해 length에서 -1 해주기
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < myNum.length; j++) {
				if(myNum[j] == num[i]) {
					c++;
				}
			}
		}
		int rank = 0;
		switch (c) {
		case 6 :	rank = 1;	break;
//		case 5 :	rank = 1;	break;	2등...보너스...어쩌지
		case 5 :	
			rank = 3;
			// 2등 여부 확인
			for (int i = 0; i < myNum.length; i++) {
				if (myNum[i] == num[6]) {
					rank = 2;
					break;
				}
			}
			break;
		case 4 :	rank = 4;	break;
		case 3 :	rank = 5;	break;
		case 2 :	rank = 0;	break;
		case 1 :	rank = 0;	break;
		}
		System.out.println(rank);

	}

}
