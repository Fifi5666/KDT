package Day09.Ex01_Computer;

public abstract class Computer {
	
	// 추상 메소드를 정의하려면, abstract 키워드를 붙여주어야 한다.
	// 추상 메소드를 정의하려면, 클래스도 추상 클래스로 정의해야 한다.
	public abstract void display();
	abstract public void typing();
	// public과 abstract의 위치는 무관하다.
	public void on() {
		System.out.println("전원을 켭니다.");
	}
	
	public void off() {
		System.out.println("전원을 끕니다.");
	}

}
