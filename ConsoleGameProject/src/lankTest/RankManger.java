package lankTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;

import user.UserManager;

public class RankManger extends UserManager{
	
	// 멋대로 리스트에 추가를 막기위한 싱글톤
	private static RankManger lm;

	private RankManger() {
	}

	public static RankManger getInctance() {
		if (lm == null) {
			lm = new RankManger();
		}
		return lm;
	}

	List<GameBoy> lank1 = new ArrayList<GameBoy>();
	List<GameBoy> lank2 = new ArrayList<GameBoy>();
	List<GameBoy> lank3 = new ArrayList<GameBoy>();
	//List<GameBoy> lank4 = new ArrayList<GameBoy>();
	List<GameBoy> list;

	void checkRank(List<GameBoy> list, String id) {
		int secondChoice = 0;// 2차메뉴를 담을 변수
		String searchName = null;
		this.list = list;
		// 이 리스트가 속이 들은지 빈지 알려주는 메소드
		if (list.isEmpty()) {
			System.out.println("게임정보가 없습니다.");

		} else {

			// ALL RANK 또는 자가랭킹 확인을 위해 나눈다
			while (true) {

				secondChoice = choiceMenu2();
				switch (secondChoice) {
				case 1:
					System.out.println("=====================================");
					System.out.println("	      GAME LANK");
					System.out.println("=====================================");
					showAllRank();
					break;
				case 2:

					System.out.println("찾으실 이름을 입력해주세요.");
					searchName = GameBasic.key.nextLine();
					int index = -1;
					// 이름이 있는지 검색
					Collections.sort(list, new Comprator());
					for (int i = 0; i < list.size(); i++) {
						if (searchName.equals(list.get(i).name)) {
							index = i;
							break;
						}
					}
					if (index < 0) {
						System.out.println("게임정보가 없습니다.");
					} else {

						for (int i = 0; i < list.size(); i++) {
							if (searchName.equals(list.get(i).name)) {
								System.out.println("================= " + (i + 1) + "등" + " ===============");
								list.get(i).showData();
								break;
							}
						}

					}
					break;
				case 3:
					//printSubMenu(id);
					break;
				default:
					System.out.println("메뉴에서 선택해주세요.");
					break;
				}
				if(secondChoice == 3) {
					break;
				}

			}
		}
	}

	// 전체 랭킹 출력
	void showAllRank() {

		Collections.sort(list, new Comprator());
		for (int i = 0; i < list.size(); i++) {
			System.out.println("================= " + (i + 1) + "등" + " ===============");
			list.get(i).showData();
		}
		return;
	}


	//2차 선택화면 
	int choiceMenu2() {
		int choice = 0;
		System.out.println("원하는 랭킹보기를 선택해주세요.");
		System.out.println("1.모든랭킹\n2.랭킹검색\n3.이전으로");
		// ALL RANK 또는 자가랭킹 확인을 위해 나눈다
		try {
			choice = GameBasic.key.nextInt();
		} catch (InputMismatchException e) {
		}
		GameBasic.key.nextLine();
		return choice;
	}
}