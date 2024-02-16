package Day10.Ex02_NestedInterface;

public class InnerInterfaceEX {
	
	public static void main(String[] args) {
		// 중첩 인터페이스의 아우터 클래스 객체 생성
		I i = new I();
		
		// 구현 객체를 메소드를 통해 지정
		i.setInterface(new ImplClass()); // I 클래스의 setter 메소드 매개변수에 전달되어 멤버 변수에 대입해준다.
		// setter 메소드로 객체를 세팅해주지 않으면 I 클래스의 j 에 대입되는 게 없으니
		// NullPointerException 에러가 난다.
		i.method();	// 실행 클래스의 메소드를 호출하여 실행문을 실행한다.
	}

}
