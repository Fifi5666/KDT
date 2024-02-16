package Day10.Ex02_NestedInterface;

public class ImplClass implements I.J {

	// I 클래스의 추상 메소드를 오버라이딩
	@Override
	public void methodA() {
		System.out.println("중첩 인터페이스 - methodA()");
	}

	@Override
	public void methodB() {
		System.out.println("중첩 인터페이스 - methodB()");
	}

}
