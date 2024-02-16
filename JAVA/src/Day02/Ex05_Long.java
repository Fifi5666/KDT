package Day02;

public class Ex05_Long {

	public static void main(String[] args) {
		
		
		// int (4bytes : 32bits) : 2^32 개 : 약 42억 개
		// int 수 표현 범위 : -21억xxx ~ 21억xxx
		
		// long (8bytes : 64bits) : 2^64 개
		long ln1 = 1000;
		long ln2 = 2100000000;
		// long 타입 리터럴 : 숫자L
		// ** L 을 붙이지 않으면 기본정수는 int 타입으로 튀급한다.
		
		long ln3 = 2200000000L; // int로 취급되기 때문에 long 자료형으로 넣으려면 L을 넣어줘야 한다.
		
		System.out.println("ln1 : " + ln1);
		System.out.println("ln2 : " + ln2);
		System.out.println("ln3 : " + ln3);

	}

}
