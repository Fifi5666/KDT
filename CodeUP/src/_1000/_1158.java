package _1000;

import java.util.Scanner;

public class _1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if( 30 <= a && a <= 40 ) 
			System.out.println("win");
		else if( 60 <= a && a <= 70 )
			System.out.println("win");
		else
			System.out.println("lose");
		
		// 강사님 풀이
		if(( 30 <= a && a <= 40 )||( 60 <= a && a <= 70 ))
			System.out.println("win");
		else
			System.out.println("lose");

	}

}
