package Day09.Ex01_Computer;

// 추상 클래스의 추상 메소드를 구현하지 않으면,
// 해당 클래스도 추상 클래스로 정의해야 한다.
// 모든 추상 메소드를 구현하지 않아도 에러가 나지 않는다.
// 추상 클래스 Laptop을 구현하는 클래스를 만들어야한다. -> MacBook
public abstract class Laptop extends Computer {

	@Override
	public void display() {
		System.out.println("Laptop - display");
	}
	
	

}
