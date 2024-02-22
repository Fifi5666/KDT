package Day12.Ex01_Object;

/**
 * Object 클래스의 eqauls() 메소드 활용
 * 
 */

class Student {
	int studentId;		// 학번
	String studentName;		// 이름
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

	// equals() 메소딩 오버라이딩
	// alt + shift + S, V
	@Override
	public boolean equals(Object obj) {	// 업캐스팅 되면 부모 객체(Object)로는 Id와 Name에 접근할 수 없다.
		// 두 객체가 의미상으로 일치하는지 여부를 true, false로 반환
		if(this == obj)
			return true;
		
		// null 체크 - 비교 대상이 null 인 경우 비교 자체가 불가
		// * NullPointerException 발생 가능
		if (obj == null) {
			return false;
		}
		
		// 학번과 학생명이 모두 일치하는 경우
		Student student = (Student) obj;	// 다운 캐스팅 해서 접근할 수 있다.
		if(this.studentId == student.studentId && this.studentName.equals(student.studentName)) {
			return true;
		}
		
		return false;
	}
	
	
}
	
public class ObjectEquals {
	
	public static void main(String[] args) {
		Student student = new Student(1001, "김조은");	// 메인 메소드에서 student 객체를 만든다.
		Student student2 = student;
		Student student3 = new Student(1001, "김조은");
		
		// 학생1과 학생2의 레퍼런스 비교
		if(student == student2) {
			System.out.println("student 와 student2의 주소(레퍼런스)가 같습니다.");
		}
		else {
			System.out.println("student 와 srudent2의 주소(레퍼런스)가 다릅니다.");
		}
		System.out.println("=======================");
		
		// 학생1과 학생2의 인스턴스 비교
		if(student.equals(student2)) {
			System.out.println("student 와 student2 는 같습니다.");
		}
		else {
			System.out.println("student 와 student2 는 다릅니다.");
		}
		System.out.println("=======================");
		
		// 학생1과 학생3의 레퍼런스 비교
		if(student == student3) {
			System.out.println("student 와 student3의 주소(레퍼런스)가 같습니다.");
		}
		else {
			System.out.println("student 와 srudent3의 주소(레퍼런스)가 다릅니다.");
		}
		System.out.println("=======================");
		
		// 학생1과 학생3의 인스턴스 비교
		// 둘이 데이터 값(실질적 변수 값)까지 같은지 보려면 equals를 오버라이딩 해줘야 한다.
		// 주소는 다르지만 안에 들어있는 학번과 이름 데이터 값(실질적 변수 값)은 같다는 것을 알 수 있다.
		if(student.equals(student3)) {
			System.out.println("student 와 student3 는 같습니다.");
		}
		else {
			System.out.println("student 와 student3 는 다릅니다.");
		}
		System.out.println("=======================");
		
	}
	
}
