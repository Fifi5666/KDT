package Day15.Ex01_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 영화 가격순으로 오름차순
 */
class Movie implements Comparable<Movie> {
	String title;
	String author;
	int price;
	
	// 생성자
	public Movie() {
		this("제목없음", "작자미상", 0);
	}
	public Movie(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	// getter, setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// toSting
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	// comparaTo()	// 타입을 지정하고 메소드를 추가해줄 때
	// - 영화 객체의 가격순으로 오름차순되도록 기준을 정의
	@Override
	public int compareTo(Movie o) {
		// this		: 해당 객체
		// o		: 비교 객체
		
		// * 제목순으로 오름차순
		String thisTitle = this.getTitle();
		String comTitle = o.getTitle();
		int result = thisTitle.compareTo(comTitle);
		return result;	// - result 음수를 바꾸면, 내림차순
		
		// String 의 compareTo() 메소드로 문자열 크기 비교
		// 사전순으로 앞쪽이 작은 문자열, 뒤쪽이 큰 문자열
		// -> 해당객체.compareTo(비교객체)
		// * 해당객체 > 비교객체 : 양수
		// * 해당객체 = 비교객체 : 0
		// * 해당객체 < 비교객체 : 음수
	}
	
}

public class ComparableEx2 {
	
	public static void main(String[] args) {
		List<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("타짜", "조승우", 12000));
		movieList.add(new Movie("스즈메의문단속", "스즈메", 12000));
		movieList.add(new Movie("이웃집토토로", "토토로", 20000));
		movieList.add(new Movie("라이언일병구하기", "스티븐스필버그", 14000));
		movieList.add(new Movie("7번방의선물", "류승룡", 15000));
		
		// 정렬 전
		System.out.println("정렬 전");
		for (Movie movie : movieList) {
			System.out.println(movie);
		}
		System.out.println("------------------------------------------");
		
		// 정렬
		// * Book 객체에 구현된 comparaTo() 메소드의 비교기준으로 정렬 - 여기선 가격
		Collections.sort(movieList);
		
		System.out.println("정렬 후");
		for (Movie movie : movieList) {
			System.out.println(movie);
		}
		
	}

}
