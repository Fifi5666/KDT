package Day03;

import java.util.Scanner;

public class Ex11_DoWhile {

	public static void main(String[] args) {
		// 메뉴판
		// 변수 선언 : 메뉴 번호, 메뉴 이름
		int menuNo = 0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		// do~while문
		// : 무조건 1회는 실행 후, 조건을 검사하여 반복하는 문장
		// 처음에는 무조건 메뉴판을 띄워줘야 볼 수 있기 때문에
		do {
			System.out.println("<메뉴판>");
			System.out.println("1. 맥도날드");
			System.out.println("2. 법대생김밥");
			System.out.println("3. 돈까스");
			System.out.println("4. 짜장면");
			System.out.println("5. 물만난면");
			System.out.print("메뉴 번호 : ");
			
			// 메뉴 번호 입력
			menuNo = sc.nextInt();
			
			// break : 제어문 탈출
			// 방법1
//			if( menuNo == 0 ) 					break;
			
			// 방법2 (메뉴판을 종료합니다도 안 나옴)
			// return
			// 1. 메소드를 종료
			// 2. 메모리 공간 해제
			// 3. (값) 메소드를 호출한 곳으로 반환
			if( menuNo == 0 ) {
				System.out.println("메뉴판을 종료합니다."); // return을 만나기 전에 따로 작성해준다.
				return;
			}
			switch (menuNo) {
				case 1: menuName = "맥도날드"; 	break;
				case 2: menuName = "법대생김밥"; 	break;
				case 3: menuName = "돈까스"; 		break;
				case 4: menuName = "짜장면"; 		break;
				case 5: menuName = "물만난면"; 	break;
				default:	break;
			}
			// 메뉴 번호 유효성 검사(조건을 어떻게 주면 좋을까)
			// 방법1 - 메뉴 번호 0~5번만 유효
			// 방법2 - 0번(종료)만 아니면 유효
			// 방법3 - 1~5번 유효, 그 이외 유효x
			
			if (menuNo >= 1 && menuNo <= 5) {
				System.out.println(menuName + "(을/를) 먹었습니다.");
				count++; // 주문할 때마다 count가 하나씩 올라간다.
			}
			else
				System.out.println("존재하지 않는 메뉴입니다.");
			
		} while (menuNo != 0);
		
		// 몇 개의 메뉴를 주문했는지 출력하기
		System.out.println(count + "개의 메뉴를 주문하였습니다.");
		System.out.println("메뉴판을 종료합니다.");
		
		sc.close();
	}

}
