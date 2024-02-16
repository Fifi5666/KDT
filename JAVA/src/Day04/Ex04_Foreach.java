package Day04;

public class Ex04_Foreach {

	public static void main(String[] args) {
		// 배열 선언 및 초기화
		String[] week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		// foreach : ctrl + space
		// - for( 자료형 반복요소명 : 배열 ) { }
		//  : 배열 또는 컬렉션의 모든 요소를 순서대로 반복하는 반복문
		for (String day : week) {
			System.out.print(day + " ");	// day : arr[i]
		}
		System.out.println();
		// for문은 증감식을 조절할 수 있는 것과 다르게, foreach문은 처음부터 끝까지 반복해야 한다.
		
		// 기본 for문
		for (int i = 0; i < week.length; i+=2) {
			System.out.print(week[i] + " ");
		}
		System.out.println();

	}

}
