package Day05.Class;

// 실행하는 코드가 없기 때문에 메인 메소드를 만들지 않는다.
public class Pikachu {

	// 클래스		: 객체를 정의하는 설계도
	// 멤버		: 변수, 메소드
	
	// 멤버변수
	public int energy;
	public String type;
	
	// 생성자
	// : 객체가 생성될 때, 실행되는 메소드
	// - 객체의 변수를 초기화하는 역할
	// * 생성자의 이름은 클래스의 이름과 동일하다.
	// - 접근지정자 반환타입 메소드명(매개변수) {}
	// - 접근지정자 메소드명(매개변수) {}
	// ** 기본 생성자
	// : 매개변수가 없는 생성자
	
	// 생성자 자동 완성 단축키
	// : alt + shift + S, O
	public Pikachu() {
		// this() 생성자에서 다른 생성자를 호출하는 메소드
		// this() 메소드는 생성자 내에서 첫문장이 되어야 한다.
//		this.energy = 100;	// 여기서는 멤버변수를 지정해줬지만, 기왕이면 this로 명시하는 것이 관례
//		this.type = "전기";
		this(100, "전기")	;	// 한 줄로 줄여 쓸 수 있다.
	}
	
	// 매개변수가 있는 생성자
//	public Pikachu(int enetgy, String type) {
//		System.out.println("매개변수가 있는 생성자가 실행됨...");
//	}
	// 메소드 오버로딩
	// : 같은 이름의 메소드를 매개변수의 타입/순서/개수를 다르게 하여 중복 정의하는 것
	public Pikachu(int energy, String type) {
		this.energy = energy;	// 어느 것이 매개변수인지 멤버변수인지 구분이 되지 않는다.
		// this로 멤버변수를 알려준다.
		this.type = type;		// this를 붙이지 않으면 0, null
	}

	
	// 메소드
	// - 접근지정자 반환타입 메소드명( 매개변수 ) {}
	// String = "십만볼트"라는 문자열
	public String aAttack() {
		return "십만볼트";
	}
	
	public String bAttack() {
		return "전광석화";
	}
	// Day06 CallByReference
	@Override
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + "]";
	}
	
	
	
}
