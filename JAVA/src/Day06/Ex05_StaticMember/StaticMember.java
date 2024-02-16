package Day06.Ex05_StaticMember;

public class StaticMember {
	
	// static 변수
	static int a;
	static int b;
	int c;	// static 변수 아님			// 인스턴스 변수
	static final double PI = 3.141592;	// 상수
	
	// static 메소드
	public static int sum(int x, int y) {
		int sum = a+b+x+y;	// a, b는 값이 선언되어 있지 않지만, 기본으로 0을 넣어준다.
		// sum += c;
		// c는 static 변수가 아니고 인스턴스 변수이기 때문에
		// 객체 생성 시 메모리에 할당되고, static 메소드 내에서 접근할 수 없다.
		return sum;
	}
	public static void main(String[] args) {
		// * static 메소드는 객체 생성없이 호출 가능
		int sum = sum(10,20);
		a = 100;
		StaticMember s1 = new StaticMember();	// 이 클래스의 객체 생성
		StaticMember s2 = new StaticMember();	// 피카츄 레벨 20처럼...
		
		int a1 = s1.a;	// 접근은 .으로
		int c1 = s1.c = 10;
		int a2 = s2.a;
		int c2 = s2.c = 20;
		// s1, s2는 하나의 a를 공유한다.
		// c는 인스턴스 변수이기 때문에 10, 20 값을 줄 수 있다. 인스턴스 변수는 객체가 있어야 한다?
		
		// PI = 100;
		// final 은 상수로 지정하는 키워드
		// : 한 번 값을 초기화한 이후에는 값을 변경할 수 없다.
		
		System.out.println("a1 : " + a1);	// a는 static 변수
		System.out.println("c1 : " + c1);
		System.out.println("a2 : " + a2);
		System.out.println("c2 : " + c2);
	}

}
