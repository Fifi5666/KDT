package Day02;

public class Ex03_Byte {

	public static void main(String[] args) {
		// byte 는 1byte 범위의 정수 데이터를 표현
		// 8bit			(0000 0000) : 2^8 : 256개
		// 양수와 음수로 나누면, -128~127(128대신에 0이 있어서)
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = (byte) 128; // 한바퀴 돌아서 -128이 됨
		// (에러)
		// - 에러 메세지 : Type mismatch
		// 자료형(타입)이 불일치, 데이터 범위를 벗어남(overflow)
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		

	}

}
