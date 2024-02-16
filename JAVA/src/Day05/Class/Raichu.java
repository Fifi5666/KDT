package Day05.Class;

// 상속
// - 키워드 : 자식클래스 extends 부모클래스
public class Raichu extends Pikachu {
	
	// 부모생성자 자동완성 : alt + shift + S, C
	public Raichu() {
		super(300, "메가전기");	// 미호출시 부모의 기본 생성자 호출
	}
	

	public Raichu(int energy, String type) {
		super(energy, type);
	}

	// 메소드 오버라이딩
	// : 부모 클래스의 메소드를 자식 클래스에서 재정의하여
	//	부모 메소드를 무시하고, 자식 메소드를 우선하여 실행하는 것(십만볼트, 전광석화 대신에...)
	
	// alt + shift + S, override
	@Override			// 어노테이션
	public String aAttack() {
		System.out.println(super.aAttack());	// 부모 꺼를 사용하고 싶으면 super를 붙여서 할 수 있다. 백만볼트 쓸 수 있지만 십만볼트를 쓸 때 super.
		return "백만볼트";
	}

	@Override
	public String bAttack() {
		return "볼트체인지";
	}
	
	// 피카츄가 라이츄가 되면서 상속과 함께 플러스 알파로 능력을 늘려준다.(그래서 c어택은 오버라이딩이 아니다)
	public String cAttack() {
		return "아이언테일";
	}

	

}
