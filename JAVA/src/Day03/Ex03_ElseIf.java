package Day03;

import java.util.Scanner;

public class Ex03_ElseIf {

	public static void main(String[] args) {
		// 학생의 성적을 입력받고, 성적에 따라 학점을 출력하시오.
		// 90점 이상, A
		// 80점 이상, B
		// 70점 이상, C
		// 60점 이상, D
		// 60점 미만, F
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적 : ");
		int score = sc.nextInt();
		char grade = 'F'; // 선언만 했을 때, 단독 if문은 에러가 나고 else if는 에러가 안 난다.
		// else if는 무조건 하나의 값을 얻어 초기화될 것이기 때문에(여집합이 있기 때문이다.)
		// 단독 if문에서는 어떤 값도 만족하지 못하고 출력되지 않을 수 있다.
		// 그 때문에, 초기 값을 넣어준다.
		
		// 조건을 만족할 때, 실행할 문장이 한 문장이면 {} 생략 가능
		if( score >= 90 && score <= 100)	grade = 'A';
//			System.out.println("학점 : A");
		if( score >= 80 && score < 90)		grade = 'B';
//			System.out.println("학점 : B");
		if( score >= 70 && score < 80)		grade = 'C';
//			System.out.println("학점 : C");
		if( score >= 60 && score < 70)		grade = 'D';
//			System.out.println("학점 : D");
		if( score < 60 && score >= 0)		grade = 'F';
//			System.out.println("학점 : F");
		// 5개의 학점 출력문을 1개로 줄이시오.
		System.out.println("학점 : " + grade);
		
		// if~else if~else
		if( score >= 90 && score <= 100) 
			grade = 'A';
		else if( score >= 80 )
			grade = 'B';
		else if( score >= 70 )
			grade = 'C';
		else if( score >= 60 )
			grade = 'D';
		else
			grade = 'F';
		System.out.println("학점 : " + grade);
		
		sc.close();
	}

}
