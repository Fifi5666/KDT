package Day10.Ex02_NestedInterface;

// 아우터 클래스
public class I {
	
	// 인터페이스 선언
	J j;	// j 인터페이스에 new ImplClass();를 대입
	
	public void setInterface(J j) {
		this.j = j;
	}
	
	// 중첩 인터페이스의 정의 // 인터페이스는 구현 클래스를 정의해야 한다.(혼자 실행할 수 없다)
	static interface J {	// 추상 메소드
		void methodA();
		void methodB();
	}
	
	void method() {
		j.methodA();
		j.methodB();
	}

}
