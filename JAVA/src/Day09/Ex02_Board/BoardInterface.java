package Day09.Ex02_Board;

/**
 * 게시판 인터페이스
 * - 데이터 등록
 * - 데이터 목록
 * - 데이터 조회
 * - 데이터 수정
 * - 데이터 삭제
 */
public interface BoardInterface {
	// 데이터 등록 // 메소드로 게시글 정보 데이터가 넘어어고 그것을 구현해서 데이터베이스에 전달해야 한다.
	// 그렇다면 메소드를 어떻게 정의하면 좋을까?
	Board create(Board board);	// create라는 이름의 메소드로 Board 객체를 전달 받는다.
	
	// 사용자가 등록을 요청하면 프로그램에서 전달 받아서 데이터베이스에 등록 시킨다.
	
	// 데이터 목록
	Board[] list();
	
	// 데이터 조회(특정 게시글)
	Board  read(int no);
	
	// 데이터 수정
	int update(Board board);
	
	// 데이터 삭제(게시글 번호만 알면 삭제할 수 있으니 번호만 매개변수로 받아온다.)
	int delete(int no);

}
