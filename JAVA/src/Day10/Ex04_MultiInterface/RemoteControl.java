package Day10.Ex04_MultiInterface;

public interface RemoteControl {
	
	// 상수
	int MAX_VOLUME = 100;
	int MIN_VOLUME = 0;
	
	// 추상 메소드
	// * (public abstract)가 자동으로 선언된다.
	// 오버라이딩 해줘야 한다.
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	void setChannel(int channel);
	
	// 디폴트 메소드
	// : 구현한 객체가 기본으로 사용할 수 있는 메소드(따로 오버라이딩을 하지 않아도)
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거 설정되었습니다.");
			setVolume(MIN_VOLUME);
		}
		else {
			System.out.println("음소거 해제되었습니다.");
			setVolume(10);
		}
	}
	
	// static 메소드
	// : 구현 객체가 없어도 인터페이스만으로 호출이 가능한 메소드(객체를 생성하지 않아도 메모리에 가장 먼저 할당이 되니까)
	static void changeBatterty() {
		System.out.println("배터리를 교환하였습니다.");
	}

}
