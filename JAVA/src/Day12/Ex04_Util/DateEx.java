package Day12.Ex04_Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	
	public static void main(String[] args) throws ParseException {
		// Date 객체는 시스템에서 현재 날짜를 가져온 정보를 가지고 있다
		Date now = new Date();
		System.out.println("now : " + now);
		
		String dateStr = now.toString();
		System.out.println("Date 문자열 기본 포맷 : " + dateStr);
		
		// 날짜/시간 문자
		// yyyy : 년도, 	MM : 월, 	dd : 일
		// hh   : 시, 	mm : 분, 	ss : 초
		String dateFormat = "yyyy년 MM월 dd일 hh시 mm분 ss초";
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		String nowStr = sdf.format(now);
		System.out.println(nowStr);
		
		String day1 = "2024/01/31";	// 개강
		String day2 = "2024/08/01";	// 종강
		
		Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse(day1);	// 파싱 :  구문분석(필요한 데이터만 원하는 형식으로 추출해서 변환하는 과정) // 예외 던지기
		Date date2 = new SimpleDateFormat("yyyy/MM/dd").parse(day2);	// Date 객체에 parse 메소드 - "2024/08/01" -> "yyyy/MM/dd" 
		
		System.out.println("date1 : " + date1);
		System.out.println("date2 : " + date2);
		
		
		// Date.getTime()
		// : 1970년1월1일0시0분0초 부터 Date에 지정된 날짜/시간 까지의 ms(밀리초) 누적값
		long gapDays = (date2.getTime() - date1.getTime()) / (1000*60*60*24);
		long gapHours = (date2.getTime() - date1.getTime()) / (1000*60*60);
		long gapMin = (date2.getTime() - date1.getTime()) / (1000*60);
		long gapSec = (date2.getTime() - date1.getTime()) / (1000);
		
		System.out.println("종강 D-day : " + gapDays);
		System.out.println("종강까지 남은 시간(/시) : " + gapHours);
		System.out.println("종강까지 남은 시간(/분) : " + gapMin);
		System.out.println("종강까지 남은 시간(/초) : " + gapSec);
		
		// Date 객체의 getXXX() 메소드는 deprecated(더 이상 사용권장 안 함)
		// --> 날짜의 년/월/일 추출하는 기능은 Calendar 클래스에서 주로 사용
		System.out.println("Today (년) : " + date1.getYear());
		System.out.println("Today (월) : " + date1.getMonth());
		System.out.println("Today (일) : " + date1.getDate());
		
		
		Date today = new Date();
		System.out.println("오늘 : " + today);
		
		long dayTime = (1000 * 60 * 60 * 24);  // 1일 : ms단위
		long day5TimeValue = 5 * dayTime;	   // 5일
		
		// 5일 후
		Date after5Days = new Date();	// Date 객체 먼저 만들고
		after5Days.setTime( today.getTime() + day5TimeValue );	// setTime 메소드를 사용하여 5일 후를 세팅
		String after5DayStr = sdf.format(after5Days);	// 포맷을 지정해서
		System.out.println(after5DayStr);	// 문자열로 출력
		
	}

}
