package Day17.Ex01_Lambda;

/**
 * 익명 객체
 * 	- 익명 자식 객체(부모 클래스를 상속받았지만, 이름이 없는 객체)
 * 	- 익명 구현 객체(인터페이스는 존재하지만 이를 구현한
 * 
 * 익명 함수
 * 
 * * 익명 자식 객체 vs 익명 구현 객체 vs 익명 함수
 */

// 익명 자식 객체의 부모 클래스 정의
class Television {
	void VolumnUp() {System.out.println("UP");}
	void VolumnDown() {System.out.println("DOWN"); }
}

// 익명 구현 객체의 인터페이스 정의
interface RemoteControl {
	void volumnUp();
	void volumnDown();
}

// 함수형 인터페이스 정의	// 인터페이스가 함수형 인터페이스인지 체크(추상메소드가 2개 이상이면 에러)
@FunctionalInterface
interface Calculator {
	int Calc(int a, int b);
	
	// 함수형 인터페이스는 추상메소드가 2개 이상 있으면 에러 발생
	// double calc(double a, doubla b);
}

public class LambdaTest {
	
	public static void main(String[] args) {
		// 익명 자식 객체
		Television tv = new Television() {

			@Override
			void VolumnUp() {
				System.out.println("UP - 구현");
			}

			@Override
			void VolumnDown() {
				System.out.println("DOWN - 구현");
			}
		};
		tv.VolumnUp();
		tv.VolumnDown();
		
		// 익명 구현 객체
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void volumnUp() {
				System.out.println("UP - 구현");
			}
			
			@Override
			public void volumnDown() {
				System.out.println("DOWN - 구현");
			}
		};
		rc.volumnUp();
		rc.volumnDown();
		
		// 익명 구현 객체2
		Calculator cal = new Calculator() {
			
			@Override
			public int Calc(int a, int b) {
				return a + b;
			}
		};
		
		int result1 = cal.Calc(10, 20);
		System.out.println("result1 : " + result1);
		
		// 람다식
		Calculator calcLambda = (a, b) -> {return a + b;};
		int result2 = calcLambda.Calc(30, 40);
		System.out.println("result2 : " + result2);
	}

}
