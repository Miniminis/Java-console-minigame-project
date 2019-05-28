package MiniGame;


import java.util.InputMismatchException;

public class Game implements GameInterface {

	Util util = new Util();

	String name;
	int point;
	int choice;

	// 영화제목 맞추기 게임

	// (공통)점수정하기
	// 시간초 메소드
	// 문제는 총 3문항이고, 정답을 맞추면 난이도별로 점수가 주어집니다.

	Game() {
	}

	// 메인시작
	public void StartWord() {
		System.out.println(name + "님 환영합니다.");
		System.out.println("영화 제목 맞추기 게임을 시작하겠습니다.");
		System.out.println("장르를 선택 후 주어지는 초성에 정답이라고 생각되는 단어를 입력하시면 됩니다.");
		System.out.println("*정답은 띄어쓰기가 맞아야합니다. 주의해주세요.");
		System.out.println("문제당 60초가 주어집니다.");
	}

	// 영화 선택 메소드
	public int showprint() {

		System.out.println("-------------------");
		System.out.println(Util.KOREA_MOVIE + ") 한국영화 ");
		System.out.println(Util.world_MOVIE + ") 외국영화");
		System.out.println(Util.ani_MOVIE + ") 애니메이션 영화");
		System.out.println("-------------------");
		int choice = 0;
		try {
			choice = util.key.nextInt();
			if (choice > 3) {
				System.out.println("----------------------");
				System.out.println("1~3사이의 숫자를 입력해주세요!");
				System.out.println("----------------------");
			}

		} catch (InputMismatchException e) {
			util.key.nextLine();
			System.out.println("----------------------");
			System.out.println("1~3사이의 숫자를 입력해주세요!");
			System.out.println("----------------------");

		}
		return choice;

	}

	// 메인이나 게임으로 돌아가는 메소드
	public void main() {
		System.out.println("1) 게임 계속하기 2) 랭킹 확인하기 3) 메인 돌아가기");
		try {
			choice = util.key.nextInt();
			switch (choice) {
			case 1:
				showprint();
				break;

			case 2:
				// 건이 부탁
				showData();
				break;

			case 3:
				// 다희씨 부탁
				System.out.println("메인으로 돌아갑니다.");
				break;

			}
		} catch (InputMismatchException e) {
			util.key.nextLine();
			System.out.println("1~3사이의 숫자를 입력해주세요!");

		}


	}

	@Override
	public void showData() {

	}

	@Override
	public void saveData() {
		System.out.println("저장!!");
	}

	//난이도 선택 메소드
	public int Level() {

		System.out.println("난이도를 선택해주세요.");
		System.out.println("1) 초급  2) 중급  3) 고급  4) 뒤로가기");
		System.out.println("<초급> 1~30점 ");
		System.out.println("<중급> 30~50점");
		System.out.println("<고급> 50~70점");
		System.out.println("저장되는 점수는 랜덤저장입니다!");
		System.out.println("더 높은 난이도에 도전해보세요!");
		int cho = 0;
		try {
			cho = util.key.nextInt();
			if (cho > 4) {
				System.out.println("----------------------");
				System.out.println("1~4사이의 숫자를 입력해주세요!");
				System.out.println("----------------------");
			}

		} catch (InputMismatchException e) {
			System.out.println("----------------------");
			System.out.println("1~4사이의 숫자를 입력해주세요!");
			System.out.println("----------------------");

		}
		util.key.nextLine();
		return cho;

	}
	public void Back() {
		showprint();
	}

}
