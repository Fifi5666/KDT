package Day03;

public class Ex14_GuguAll {

	public static void main(String[] args) {
		// (단)*(1~9)
		// 단에 대한 반복	: 1~9
		// 각 단의 곱		: 1~9
		// 한 단이 끝나면 개행
		
		// 중첩 반복문
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print("\t");    	// 탭(공백)
			}
			System.out.println();			// 한 단 끝 개행
		}

	}

}
