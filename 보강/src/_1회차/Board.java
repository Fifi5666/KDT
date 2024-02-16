package _1회차;

import java.util.Date;

public class Board {
	// 글번호
	// 제목
	// 작성자
	// 내용
	// 등록일자
	// 수정일자
	private int no;
	// 꼭 있어야 하는 변수(객체가 만들어질 때, 바로 데이터를 넣어주기 위해 매개변수가 있는 생성자를 생성한다.)
	private String title;
	private String writer;
	private String content;
	
	private Date regDate;
	private Date upgDate;
	
	// 생성자
	public Board() {
	}

	public Board(String title, String writer, String content) {
		// 멤버변수의 이름과 매개변수의 이름이 같을 때, 구분해주기 위해서 this를 붙인다.
		// 이름이 다르다면? 붙일 필요가 없다.
		this.title = title;
		this.writer = writer;
		this.content = content;
	}

	// getter, setter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpgDate() {
		return upgDate;
	}

	public void setUpgDate(Date upgDate) {
		this.upgDate = upgDate;
	}

	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate="
				+ regDate + ", upgDate=" + upgDate + "]";
	}
	
	

}
