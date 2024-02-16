package Day10.Ex03_AnonymousObject;

public class RemoteControlEx {
	
	public static void main(String[] args) {
		// 익명 구현 객체
		// : 클래스를 정의하지 않고도, 이름없이 구현한 객체
		// - 인터페이스명 객체명 = new 인터페이스(인자1,...) { 객체정의 }
		// 정의만 한 것, 실행은 되지 않는다.
		RemoteControl rc = new RemoteControl() {	// 인터페이스를 implements 했을 때, 자동으로 오버라이딩을 추가할 수 있었는데,
			// 이렇게 이름 없이 오버라이딩 할 수도 있다.
			int speed = 0;
			@Override
			public void turnOn() {
				System.out.println("ON");
			}
			
			@Override
			public void turnOff() {
				System.out.println("OFF");
			}
			
			@Override
			public void setSpeed(int speed) {
				this.speed = speed;
				System.out.println("속도 : " + this.speed);
			}
		};
		
		rc.turnOn();
		rc.setSpeed(50);
		rc.turnOff();
		// 이렇게 메소드를 호출해야 실행이 된다.
	}

}
