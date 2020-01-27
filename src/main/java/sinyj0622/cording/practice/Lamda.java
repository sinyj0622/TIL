package sinyj0622.cording.practice;

public class Lamda {


	static interface Player {
		void play();
	}

	public static void main(String[] args) {

		Player p1 = () -> System.out.println("우리는 행동합니다.");
			
		p1.play();
		
		//Player 인터페이스를 구현한 익명클래스의 메소드 사용하기
	}

}
