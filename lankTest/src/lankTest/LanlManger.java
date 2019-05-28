 package lankTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;

public class LanlManger {
	private static LanlManger lm;

	private LanlManger() {
	}

	public static LanlManger getInctance() {
		if (lm == null) {
			lm = new LanlManger();
		}
		return lm;
	}

	List<GameBoy> lank1 = new ArrayList<GameBoy>();
	List<GameBoy> lank2 = new ArrayList<GameBoy>();
	List<GameBoy> lank3 = new ArrayList<GameBoy>();
	List<GameBoy> lank4 = new ArrayList<GameBoy>();
	int secondChoice = 0;// 2차메뉴를 담을 변수
	List<GameBoy> list;
	String searchName = null;

	void checkRank(List<GameBoy> list) {
		this.list = list;
		// 이 리스트가 속이 들은지 빈지 알려주는 메소드
		if (list.isEmpty()) {
			System.out.println("PLAY THE GAME FIRST...!");

		} else {

			// ALL RANK 또는 자가랭킹 확인을 위해 나눈다
			while (true) {

				secondChoice = choiceMenu2();
				switch (secondChoice) {
				case 1:
					System.out.println("==GAME RANK==");
					showAllRank();
					break;
				case 2:

					System.out.println("ENTER NAME");
					searchName = GameBasic.key.nextLine();
					int index = -1;
					// 이음이 있는지 검색
					Collections.sort(list, new Comprator());
					for (int i = 0; i < list.size(); i++) {
						if (searchName.equals(list.get(i).name)) {
							index = i;
							break;
						}
					}
					if (index < 0) {
						System.out.println("PlAY THE GAME FIRST..");
					} else {

						for (int i = 0; i < list.size(); i++) {
							if (searchName.equals(list.get(i).name)) {
								System.out.println("-----" + (i + 1) + "등" + "-----");
								list.get(i).showData();// 수정
								break;
							}
						}

					}
					break;
				case 3:
					System.out.println("BACK");
					break;
				default:
					System.out.println("마! 똑바로 숫자 안 누르나 ! 팍 씨!");
					break;
				}
				// 이전 화면으로 돌아가기
				if (secondChoice == 3) {
					break;
				}

			}
		}
	}

	// 전체 랭킹 출력
	void showAllRank() {

		Collections.sort(list, new Comprator());
		for (int i = 0; i < list.size(); i++) {
			System.out.println("-----" + (i + 1) + "등" + "-----");
			list.get(i).showData();
		}
		return;
	}

//2차 선택화면 
	int choiceMenu2() {
		int choice = 0;
		System.out.println("1.ALL RANK\n2.MY RANK\n3.BACK");
		// ALL RANK 또는 자가랭킹 확인을 위해 나눈다
		try {
			choice = GameBasic.key.nextInt();
		} catch (InputMismatchException e) {
		}
		GameBasic.key.nextLine();
		return choice;
	}
}