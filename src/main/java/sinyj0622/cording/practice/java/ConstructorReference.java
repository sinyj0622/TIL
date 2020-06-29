package sinyj0622.cording.practice.java;

import java.util.ArrayList;
import java.util.List;

public class ConstructorReference {
	
static interface ListFactory {
	List create();
}

	public static void main(String[] args) {

		ListFactory f1 = ArrayList::new;
		
		List list = f1.create();
	}
}
	

// 매서드 한 개짜리 인터페이스의 구현체를 만들 떄
// 기존 스태틱 메서드를 람다 구현체로 사용할 수 있다
// 클래스명::메서드명

