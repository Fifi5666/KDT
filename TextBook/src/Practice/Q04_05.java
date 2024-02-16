package Practice;

public class Q04_05 {
	
	public static void main(String[] args) {
		
		int line = 4;
		
		for(int i = 0; i < line; i++) {
			for(int j = 0; j < line - i - 1; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
		System.out.println();
		}
		for(int i = 0; i < line - 1; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < (line - i - 1) * 2 - 1; k++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
	}
	
}
