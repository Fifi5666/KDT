package MISSION06;

import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Mission06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임?");
		int game = sc.nextInt();
		
		for (int i = 0; i < game; i++) {
			System.out.print("[" + (i+1) + "게임]: ");
			int[] lotto = new int[6];
			
			for (int j = 0; j < lotto.length; j++) {
				int no = (int)(Math.random() * 45 + 1);
				lotto[j] = no;
				for (int k = 0; k < j; k++) {
					if(lotto[j] == lotto[k]) {
						j--;
					}
				}	
			}
			Arrays.sort(lotto);
			for (int l : lotto) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
		
	}

}
