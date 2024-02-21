package Day14.Ex02_WildCard;

public class WildCardEx {
	
	// ? (와일드 카드)
	// : 알 수 없는 타입을 대체하기 위해서 사용하는 기호
	// 일반 과정
	public static void checkCourse(Course<?> course) {	// 객체를 받아옴
		System.out.println("과정명 : " + course.getName());
//		System.out.println(course.getStudents());
		Object[] studentList = course.getStudents();
		for (Object student : studentList) {
			System.out.println(student);
		}
	}
	
	// 직장인 과정
	public static void checkWorkerCourse(Course<? super Worker> course) {	// super를 이용해 Worker로 한정을 지을 수 있다.
		// Worker 앞에 super를 붙이면 거꾸로 올라간다. Worker부터 Person까지
		// T extends Person 의 경우(extends로 제한을 둔 경우) Person부터 자식 모두에 접근할 수 있었다.
		System.out.println("과정명 : " + course.getName());
		Object[] studentList = course.getStudents();
		for (Object student : studentList) {
			System.out.println(student);
		}
	}
	
	// 학생 과정
	public static void checkStudentCourse(Course<? extends Student> course) {
		System.out.println("과정명 : " + course.getName());
		Object[] studentList = course.getStudents();
		for (Object student : studentList) {
			System.out.println(student);
		}
	}
	
	public static void main(String[] args) {	// 코스 객체가 Person, Student 중 무엇으로 만들어질지
		// 일반 과정, 정원 5명
		Course<Person> personCourse = new Course<>("일반과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		personCourse.add(new MiddleStudent("중학생"));
		checkCourse(personCourse);	// 코스 객체를 생성하기 전에는 타입을 알 수 없으니 확정되지 않은 객체를 받아 올때, 와일드 카드 사용
	
		// 직장인 과정, 정원 5명	// 직장인만 수강생이 될 수 있다.
		Course<Worker> workerCourse = new Course<>("직장인과정", 5);
//		workerCourse.add(new Person("일반인"));
		workerCourse.add(new Worker("직장인"));
//		workerCourse.add(new Student("학생"));
//		workerCourse.add(new HighStudent("고등학생"));
//		workerCourse.add(new MiddleStudent("중학생"));	// 타입이 달라져서 Worker 이외에는 사용할 수 없다.
		
		checkCourse(workerCourse);			// 제한이 없어 모두 가능
		checkWorkerCourse(workerCourse);	// 직장인 코스를 체크
		checkWorkerCourse(personCourse);	// 직장인 과정을 확인하는 체크로 Person까지 확인 가능
		
		// 학생 과정, 정원 5명
		Course<Student> StudentCourse = new Course<>("학생과정", 5);
//		StudentCourse.add(new Person("일반인"));	// 학생만 사용할 수 있다.
//		StudentCourse.add(new Worker("직장인"));
		StudentCourse.add(new Student("학생"));
		StudentCourse.add(new HighStudent("고등학생"));
		StudentCourse.add(new MiddleStudent("중학생"));
		
		// 중학생 과정
		Course<Student> middleStudentCourse = new Course<>("중학생과정", 5);
		// 고등학생 과정
		Course<Student> highStudentCourse = new Course<>("고등학생과정", 5);

//		checkStudentCourse(PersonCourse);	// extends 제한으로 사용 불가능
//		checkStudentCourse(WorkerCourse);
		checkStudentCourse(middleStudentCourse);
		checkStudentCourse(highStudentCourse);
		checkStudentCourse(StudentCourse);
	}

}
