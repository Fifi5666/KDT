package Day05.Ex_Student;

public class Student {
	
	// 학생의 속성 : 이름, 나이, 학번, 전공
	// 학생의 행동 : 공부하기, 성적 평균 구하기
	
	
	// 변수
	String name;
	int age;
	String stdNo;
	String major;
	
	// 생성자, 체크 다 풀고 만들고 다 체크하고도 만들고 완성
	public Student() {
		this("이름없음", 1, "0000000", "없음");	// 학생 한 명 만들 때, 기본값
	}
	
	
	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}





	// 메소드
	// - 공부하기
	public void study(String subject) {
		System.out.println(subject + "(을/를) 공부합니다.");
		// void : 반환타입 없음 -> return(반환할 게 있어야 한다)을 생략가능
	}
	// - 성적 평균 구하기
	public double getAverage(int score1, int score2) {
		double average = 0.0;
		// (평균) = (합계) / (개수)
		average = (double) (score1 + score2) / 2;
		return average;
	}
	
	// 메소드 오버로딩(중복정의 : 다형성)
	public double getAverage(int score1, int score2, int score3) {
		double average = 0.0;
		// (평균) = (합계) / (개수)
		average = (double) (score1 + score2 + score3) / 3;
		return average;
	}
	
	// 많을 때는 배열을 이용한다. 역시나 메소드 오버로딩
	public double getAverage(int[] scores) { // 평균은 정수로 떨어지지 않을 수 있다.
		double average = 0.0;
		// (평균) = (합계) / (개수)
		// 합계
		// - 합계를 구해보세요
		int sum = 0;
		for (int i : scores)	// foreach
			sum += i;							// sum = sum + i;
		// 평균
		// - 평균을 구해보세요
		average = (double) sum / scores.length;
		return average;
	}

}
