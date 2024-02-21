package Day14.Ex02_WildCard;

public class Person {
	
	private String name;

	// 매개변수 생성자
	public Person(String name) {
		super();
		this.name = name;
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// to String
	@Override
	public String toString() {
		return "Person [" + name + "]";
	}
	
	

}
