package _1000;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(id, "-");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.print(token);
		}
		System.out.println();
	}

}
