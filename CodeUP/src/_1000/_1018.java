package _1000;

import java.util.Scanner;

public class _1018 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		String[] arr = time.split(":");
		
		System.out.printf("%s:%s",arr[0],arr[1]);
		
		sc.close();
	}

}
