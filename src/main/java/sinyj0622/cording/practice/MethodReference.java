package sinyj0622.cording.practice;

public class MethodReference {
	
	static class MyCalculator {
		public static int plus(int a, int b) {return a + b;}
		public static int minus(int a, int b) {return a - b;}
	}
	
	static interface Calculator {
		int compute(int a, int b);
	}

	public static void main(String[] args) {

		Calculator c1 = MyCalculator::plus;
		Calculator c2 = MyCalculator::minus;
		
		System.out.println(c1.compute(200, 100));
		System.out.println(c2.compute(200, 100));
	}

}

// 매서드 한 개짜리 인터페이스의 구현체를 만들 떄
// 기존 스태틱 메서드를 람다 구현체로 사용할 수 있다
// 클래스명::메서드명

