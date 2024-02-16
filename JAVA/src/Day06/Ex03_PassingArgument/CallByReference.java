package Day06.Ex03_PassingArgument;

import Day05.Class.Pikachu;	// 외부 클래스에 있는 피카츄를 사용하기 위해 임포트

public class CallByReference {	// 주소로 찾아가서 값을 바꿀 수 있다.
	
	public static void main(String[] args) {
		int arr[] = new int[5];
		Pikachu pikachu = new Pikachu();
		
		// arr[] : [1][2][3][4][5]
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1);
		}
		
		System.out.println("----- main() 메소드 -----");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(pikachu);
		
		// 레퍼런스에 의한 호출 : Call By Reference
		// - 참조 자료형을 전달하는 방식
		setArr( arr );
		setObject( pikachu );
		
		System.out.println("----- set**() 메소드 호출 후 -----");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(pikachu);
	}
	

	private static void setArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// 10 20 30 40 50
			arr[i] = (i+1) * 10;
		}
		System.out.println("----- setArr() 메소드 -----");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	private static void setObject(Pikachu pikachu) {
		pikachu.energy = 1000;
		pikachu.type = "에스퍼";
		System.out.println("----- setObject() 메소드 -----");
		System.out.println(pikachu);
		System.out.println();
	}

}
