package _1000;

import java.util.Scanner;

public class _1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();
		
		if( 50 <= a && a <= 60 )
			System.out.println("win");
		else
			System.out.println("lose");
		
		// 강사님 풀이
		double input = sc.nextDouble();
		
		if( 50.0 <= input && input <= 60.0 )
			System.out.println("win");
		else
			System.out.println("lose");

	}

}
