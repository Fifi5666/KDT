package Day09.Ex02_Board;

import java.util.Scanner;

// 실행 클래스
public class Main {
	
	public static void main(String[] args) {
		
		BoardInterface boardInterface = new BoardAccess();
		Scanner sc = new Scanner(System.in);
		
		int menuNo;
		do {
			System.out.println("===== 게시판 =====");
			System.out.println("1. 게시글 목록");
			System.out.println("2. 게시글 등록");
			System.out.println("3. 게시글 조회");
			System.out.println("4. 게시글 수정");
			System.out.println("5. 게시글 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			
			menuNo = sc.nextInt();
			sc.nextLine();	// 엔터를 없애준다.
			
			switch (menuNo) {
				case 1 :	// 게시글 목록
							Board[] boardList = boardInterface.list();
							for(Board board : boardList) {
								System.out.println(board);
							}
							break;
				case 2 :	// 게시글 등록
							System.out.print("제목 : ");
							String title = sc.nextLine();
							System.out.print("작성자 : ");
							String writer = sc.nextLine();
							System.out.print("내용 : ");
							String content = sc.nextLine();
							
							Board board = new Board(title, writer, content);
							Board createBoard = boardInterface.create(board);
							
							if(createBoard != null) {
								System.out.print("생성된 게시글 정보 : ");
								System.out.println(createBoard);
							}
							break;
				case 3 :	// 게시글 조회
							System.out.print("조회할 글 번호 : ");
							int no = sc.nextInt();
							Board selectedBoard = boardInterface.read(no);
							if(selectedBoard != null) {
								System.out.print("조회된 게시글 정보 : ");
								System.out.println(selectedBoard);
							}
							break;
				case 4 : 	// 게시글 수정
							// 수정한 게시글 번호, 수정 게시글 정보 입력
							System.out.print("수정할 글 번호 : ");
							int updateNo = sc.nextInt();
							sc.nextLine();
							System.out.print("제목 : ");
							String updateTilte = sc.nextLine();
							System.out.print("작성자 : ");
							String updatewriter = sc.nextLine();
							System.out.print("내용 : ");
							String updatecontent = sc.nextLine();
							
							Board updateBoard = new Board(updateTilte, updatewriter, updatecontent);
							updateBoard.setNo(updateNo);	// 게시글 번호 지정(몇 번 글을 수정할 것인지)
							int result = boardInterface.update(updateBoard);
							if( result > 0 ) {
								System.out.println("게시글 수정을 완료하였습니다.");
							}
							else {
								System.err.println("게시글 수정에 실패하였습니다.");
							}
							break;
				case 5 : 	// 게시글 삭제
							System.out.print("삭제할 글 번호 : ");
							int delteNo = sc.nextInt();
							sc.nextLine();	// 엔터 제거
							result = boardInterface.delete(delteNo);
							if(result > 0) {
								System.out.println("게시글 삭제를 완료하였습니다.");
							}
							else {	// 0보다 크지 않으면
								System.err.println("게시글 삭제에 실패하였습니다.");
							}
							break;
				default:
							break;
			}
		} while (menuNo != 0);
		System.out.println("프로그램이 종료됩니다...");
	}

}
