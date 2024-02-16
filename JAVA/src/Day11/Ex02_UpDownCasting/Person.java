package Day11.Ex02_UpDownCasting;

public class Person {
	
	String name;
	int age;
	
	// 기본 생성자
	public Person() {
		this("이름", 1);
	}
	
	// 매개 변수가 있는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 메소드
	public String work() {
		return "일을 합니다";
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
