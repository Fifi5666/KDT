package Ex.Chapter09_1;

public class ComputerTest {
	
	public static void main(String[] args) {
		// 추상 클래스는 인스턴스 객체를 생성할 수 없다. 구현된 메소드가 없기 때문이다.
//		Computer c1 = new Computer();
		Computer c2 = new DeskTop();
//		Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
	}

}
