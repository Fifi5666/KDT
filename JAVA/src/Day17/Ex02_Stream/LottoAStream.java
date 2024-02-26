package Day17.Ex02_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LottoAStream {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임? ");
		int N = sc.nextInt();
		
		// N번 반복
		for (int i = 0; i < N; i++) {
			System.out.print("[" + (i+1) + " 게임] : ");
			List<Integer> lottoList = new ArrayList<Integer>();
			
			// 랜덤 수 6개를 대입
			HashSet<Integer> set = new HashSet<Integer>();
			for (int j = 0; j < 6; j++) {
				int rand = (int) (Math.random() * 45 + 1); // 1~45 랜덤 수
				
				// 중복제거
				// - set.add()	: 중복 아니면 true, 중복이면 false
				if( !set.add(rand) ) j--;	// 중복이면 j--
				
			} // 랜덤 수 6개 대입 (끝)
			
			// 스트림을 사용하여, Set(중복되지 않은 숫자 6개) 를 List 로 변환하여 대입
			lottoList = set.stream().collect(Collectors.toList());
			
			//스트림을 사용하여, 정렬 + 출력
			lottoList.stream().sorted().forEach(lotto -> System.out.print(lotto + " "));
			System.out.println();
		}
		
		sc.close();
	}

}
