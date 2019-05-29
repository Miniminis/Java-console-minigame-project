package movieGame;

import java.util.InputMismatchException;

import lankTest.GameBoy;
import user.UserManager;

public class Game extends UserManager {

	Util util = new Util();

	String name;
	int point;
	final int check = 2;
	
	GameBoy gb = new GameBoy(); //랭킹 인스턴스 생성 

	// 메인시작
	public void StartWord(String id) {

		this.name = id;
		this.point = userinfo.get(id).getScore();

		System.out.println("=====================================");
		System.out.println("	      MOVIE QUIZ");
		System.out.println("=====================================");
		System.out.println(id + "님 환영합니다.");
		System.out.println("=====================================");
		System.out.println("  - 게임   설명 -");
		System.out.println("장르를 선택 후 주어지는 초성에 정답이라고");
		System.out.println("생각되는 단어를 입력하시면 됩니다.");
		System.out.println("문제당 60초가 주어지며,");
		System.out.println("정답은 띄어쓰기가 맞아야합니다.");
	}

	// 영화 선택 메소드
	public int showprint() {

		int choice = 0;
		System.out.println("=====================================");
		System.out.println("	        영화장르 선택");
		System.out.println("=====================================");
		System.out.println(Util.KOREA_MOVIE + ") 한국영화 ");
		System.out.println(Util.world_MOVIE + ") 외국영화");
		System.out.println(Util.ani_MOVIE + ") 애니메이션 영화");
		System.out.println("4) 메인");
		System.out.println("=====================================");

		try {
			choice = util.key.nextInt();
		} catch (InputMismatchException e) {

		}
		util.key.nextLine(); // 버퍼제거

		return choice;

	}

	// 난이도 선택 메소드
	public int Level() {
		
		
		System.out.println("=====================================");
		System.out.println("	     난이도를 선택해주세요.");
		System.out.println("=====================================");
		System.out.println("1) 초급  2) 중급  3) 고급  4) 뒤로가기");
		System.out.println("<초급> 1~30점 ");
		System.out.println("<중급> 30~50점");
		System.out.println("<고급> 50~70점");
		System.out.println("저장되는 점수는 랜덤저장입니다!");
		System.out.println("더 높은 난이도에 도전해보세요!");
		int cho = 0;
		try {
			cho = util.key.nextInt();
		} catch (InputMismatchException e) {
		}
		util.key.nextLine();
		return cho;

	}

	// 오류처리 사용 메소드
	public void Print() {
		System.out.println("======================");
		System.out.println("1~3사이의 숫자를 입력해주세요!");
		System.out.println("======================");
	}

	// 오류처리 사용 메소드
	public void Print2() {
		System.out.println("======================");
		System.out.println("1~4사이의 숫자를 입력해주세요!");
		System.out.println("======================");
	}

	// 틀린답 출력메소드
	public void WrongAnswer() {
		System.out.println("틀렸습니다. 다시생각해보세요.");
	}

	// 힌트 출력메소드
	public void answer2() {
		System.out.println("힌트가 필요하시면 \"힌트\"를 입력해주세요. ");
		System.out.println("정답을 입력해주세요!");
	}

//	public void GoMain() {
//		// 메인
//	}
	
	// 유저-게임포인트 저장 메서드
	public void savePoint(String name, int point) {
		gb.name=name;
		gb.point=point;
		gb.saveData(check);
	}

}
