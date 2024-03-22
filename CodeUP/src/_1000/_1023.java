package _1000;

import java.util.Scanner;

public class _1023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double no = sc.nextDouble();
		
		String co = String.valueOf(no);
		
		String [] answer = co.split("\\.");
		System.out.println(answer[0] + '\n' + answer[1]);

	}

}
