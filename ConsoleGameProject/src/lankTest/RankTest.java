package lankTest;

import java.util.InputMismatchException;
import java.util.List;

import user.UserManager;
import util.Menu;

public class RankTest extends UserManager {
	static RankManger rm = RankManger.getInctance();
	static List<GameBoy> list;

	public static void rank(String id) {

		// 보고싶은 게임고르기
		int choice = 0;
		while (true) {

			list = null;

			choice = choiceMenu();

			switch (choice) {
			case Menu.FIRST_GAME:
				list = rm.lank1;
				rm.checkRank(list, id);
				break;
			case Menu.SECOND_GAME:
				list = rm.lank2;
				rm.checkRank(list, id);
				break;
			case Menu.THIRD_GAME:
				list = rm.lank3;
				rm.checkRank(list, id);
				break;
			case Menu.BACK: {
				System.out.println("이전 메뉴로 돌아갑니다.");
				break;
			}

			default:
				System.out.println("메뉴에서 선택해주세요.");
				break;
			}
			if (Menu.BACK == choice) {
				break;
			}

		}
	}

	public static int choiceMenu() {
		int choice = 0;
		System.out.println("=====================================");
		System.out.println("	      게임랭킹확인");
		System.out.println("=====================================");
		System.out.printf("%d.행맨(HangMan) 게임\n%d.두번째 게임\n%d.세번째 게임\n%d.이전으로\n", Menu.FIRST_GAME, Menu.SECOND_GAME,
				Menu.THIRD_GAME, Menu.BACK);
		// 예외처리 정수형 이외의 키를 입력할시 0을 리턴시켜 위 switch문에서 default를 실행시킨다.
		try {
			choice = GameBasic.key.nextInt();
		} catch (InputMismatchException e) {

		}
		GameBasic.key.nextLine();
		return choice;

	}

}
