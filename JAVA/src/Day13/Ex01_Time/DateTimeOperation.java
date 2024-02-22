package Day13.Ex01_Time;

import java.time.LocalDateTime;

public class DateTimeOperation {
	
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("현재 시간 : " + now);
		
		// 날짜, 시간 추가하기
		// +1년 +1개월 +1일 -3시간 -15분 -25초
		LocalDateTime targetTime = now.plusYears(1)		// 1년 plus 반환
									  .plusMonths(1)	// 1개월 plus
									  .plusDays(1)		// 1일 plus...
									  .plusHours(-3)	// 이런 식으로 체인처럼 하나의 객체에서 메소드가 이어진다.
									  .plusMinutes(-15)
									  .plusSeconds(-25)
									  ;  // (메소드 체이닝), 빌더 패턴
		System.out.println("변경 시간 : " + targetTime);
	} 

}







