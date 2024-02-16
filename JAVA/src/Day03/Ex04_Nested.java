package Day03;

import java.util.Scanner;

public class Ex04_Nested {

	public static void main(String[] args) {
		// 중첩 조건문
		// 조건문 안에 조건문이 들어있다.
		// ** 중첩 if문은 권장하지 않는다.
		
		Scanner sc = new Scanner(System.in);
		
		// 정보처리기사 자격증 합격기준
		// 4학년, 60점 이상 - 합격
		System.out.print("학년 : ");
		int year = sc.nextInt();
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		// 4학년
//		if ( year == 4 ) { 
//			// 60점 이상
//			if( score >= 60 ) {
//				System.out.println("합격!");
//			}
//			else {
//				System.out.println("불합격!");
//			}
//		}
//		else {
//			System.out.println("응시자격 요견에 해당되지 않습니다.");
//		}
		
		// 중첩된 if문을 단일 if문으로 변경해보세요.
		if( year == 4 && score >= 60) {
			System.out.println("합격!");
		}
		else if( year > 4 || year < 4){ // 4학년만 응시자격이 있다.
			System.out.println("응시자격 요건에 해당되지 않습니다.");
		}
		else {
			System.out.println("불합격!");
		}
		
		// 강사님 풀이
		// 집합 그림을 떠올릴 수 있어야 한다.
		if( year == 4 && score >= 60) {
			System.out.println("합격!");
		}
		else if( year == 4){ // 학년만 4학년일 때
			System.out.println("불합격!");
		}
		else {
			System.out.println("응시자격 요건에 해당되지 않습니다.");
		}
		
		// 다른 학생분 풀이
		if(year != 4)
			System.out.println("응시자격 요건에 해당되지 않습니다.");
		else if(score >= 60)
			System.out.println("합격!");
		else 
			System.out.println("불합격!");

	}

}
