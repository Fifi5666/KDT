package Practice;

public class Q04_05_ {
	
	public static void main(String[] args) {
		
		int line = 7;
		
		for(int i = 0; i < line; i++) {
			// 절대값을 구하는 함수 Math.abs를 이용한다.
			for(int j = 0; j < Math.abs(line/2 - i); j++) {
				System.out.print(" ");
			}
			for(int z = 0; z > line/2 * 2 - i*2 * 2; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
