package Day10.Ex03_AnonymousObject;

public interface RemoteControl {
	
	// 상수
	// 최저 속력, 최고 속력 상수를 선언하시오.
	// * 인터페이스는 변수 선언 시, (public static final)이 자동으로 선언된다.
	int MAX_SPEED = 300;
	int MIN_SPEED = 0;
	
	// 추상 메소드
	// * (public abstract)가 자동으로 선언된다.
	// 오버라이딩 해줘야 한다.
	void turnOn();
	void turnOff();
	void setSpeed(int speed);
	
	// 디폴트 메소드
	// : 구현한 객체가 기본으로 사용할 수 있는 메소드(따로 오버라이딩을 하지 않아도)
	default void parking(boolean check) {
		if(check) {
			System.out.println("주차 되었습니다.");
			setSpeed(MIN_SPEED);
		}
		else {
			System.out.println("주행 모드를 시작합니다.");
			setSpeed(10);
		}
	}
	
	// static 메소드
	// : 구현 객체가 없어도 인터페이스만으로 호출이 가능한 메소드(객체를 생성하지 않아도 메모리에 가장 먼저 할당이 되니까)
	static void changeBatterty() {
		System.out.println("배터리를 교환하였습니다.");
	}

}
