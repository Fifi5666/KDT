package MISSION09;

import java.util.Scanner;

public class Mission09 {
	/*
	 * 성명과 간식비를 입력받는다.
	 * 성명이 QUIT 가 되면 입력이 종료된다.
	 * 성명/출장비/오만원/만원/오천원/천원/오백원/백원/오십원/십원/일원
	 * 입력받은 개인별로 성명과 간식비가 출력된다.
	 * 간식비는 각 화폐 단위로 나누어진다.
	 * 마지막에는 각 화폐 단위마다 총 화폐 매수가 출력된다.
	 */
	public static void main(String[] args) {
		String name = "";
		int money;
		int count;
		int piece = 50000;
		
		Scanner sc = new Scanner(System.in);
		name =  sc.nextLine();
		money = sc.nextInt();
		
		boolean sw = true;
		System.out.println("성명"+ "\t"+"출장비"+ "\t"+"오만원"+ "\t"+"만원"+ "\t"+"오천원"+ "\t"+"천원"+ "\t"+"오백원"+ "\t"+"백원"+ "\t"+"오십원"+ "\t"+"십원"+ "\t"+"오원"+ "\t"+"일원");
		System.out.print(name + "\t" + money + "\t");
		while(piece >= 1) {
			// 3. 화폐매수 계산
			count = money / piece;
			System.out.print(count + "	");
			// 잔액 계산 // 잔액은 반복된다. 아래 둘 중 한 가지를 사용한다.
			money = money - (piece * count);
			
			// 화폐단위변환
			if(sw)
				piece = piece / 5;
			else
				piece = piece / 2;
			sw = !sw;	// true일 때 false로 바뀌고, 다음엔 false일 때, true로 바뀐다. not	
		}
		while (name != "QUIT") {
			
		}

	}

}
