package _1000;

import java.util.Scanner;

public class _1159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if( 50 <= a && a <= 70 ) 
			System.out.println("win");
		else if( a % 6 == 0 )
			System.out.println("win");
		else
			System.out.println("lose");
		
		// 강사님 풀이
		if(( 50 <= a && a <= 70 )||( a % 6 == 0 ))
			System.out.println("win");
		else
			System.out.println("lose");

	}

}
