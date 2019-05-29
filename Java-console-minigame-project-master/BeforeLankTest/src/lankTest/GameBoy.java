package lankTest;

import java.util.Collections;
import java.util.List;

class GameBoy extends LankTest {

	String name;
	int point;

	// 게임선택창에서 선택한 수를 가져와 담아줄 변수

	GameBoy() {
	}

	GameBoy(String name, int point) {
		this.name = name;
		this.point = point;
	}

	public void setInfo(String name, int point) {
		this.name = name;
		this.point = point;
	}

	public void showData() {
		System.out.println("USERNAME:" + name);
		System.out.println("POINT   :" + point);
		System.out.println("-------------");
	}

	public void saveData(int check) {
		// 게임 선택에서 고른수를 가져와 그 게임에 맞는 결과를 저장한다

		switch (check) {
		case 1:
			firstDataUp();
			break;
		case 2:
			secondDataUp();
			break;
		case 3:
			thirdDataUp();
			break;
		case 4:
			fourthDataUp();
			break;

		}
	}

//점수갱신
	void firstDataUp() {
		int index = -1;
		Collections.sort(rm.lank1, new Comprator());
		for (int i = 0; i < rm.lank1.size(); i++) {
			if (name.equals(rm.lank1.get(i).name) && point >= rm.lank1.get(i).point) {
				index = i;
				break;
			}
		}
		if (index < 0) {
			System.out.println("정보가 저장되었습니다");
			rm.lank1.add(new GameBoy(name, point));
			showData();
		} else {
			System.out.println("새로운 점수로 갱신되었습니다");
			rm.lank1.set(index, new GameBoy(name, point));
			showData();
		}
	}

	void secondDataUp() {
		int index = -1;

		Collections.sort(rm.lank2, new Comprator());

		for (int i = 0; i < rm.lank2.size(); i++) {
			if (name.equals(rm.lank2.get(i).name) && point >= rm.lank2.get(i).point) {
				index = i;
				break;
			}
		}
		if (index < 0) {
			System.out.println("정보가 저장되었습니다");
			rm.lank2.add(new GameBoy(name, point));
			showData();
		} else {
			System.out.println("새로운 점수로 갱신되었습니다");
			rm.lank2.set(index, new GameBoy(name, point));
			showData();
		}
	}

	void thirdDataUp() {
		int index = -1;
		Collections.sort(rm.lank3, new Comprator());
		for (int i = 0; i < rm.lank3.size(); i++) {
			if (name.equals(rm.lank3.get(i).name) && point >= rm.lank3.get(i).point) {
				index = i;
				break;
			}
		}
		if (index < 0) {
			System.out.println("정보가 저장되었습니다");
			rm.lank3.add(new GameBoy(name, point));
			showData();
		} else {
			System.out.println("새로운 점수로 갱신되었습니다");
			rm.lank3.set(index, new GameBoy(name, point));
			showData();
		}
	}

	void fourthDataUp() {
		int index = -1;
		Collections.sort(rm.lank4, new Comprator());
		for (int i = 0; i < rm.lank4.size(); i++) {
			if (name.equals(rm.lank4.get(i).name) && point >= rm.lank4.get(i).point) {
				index = i;
				break;
			}
		}
		if (index < 0) {
			System.out.println("정보가 저장되었습니다");
			rm.lank4.add(new GameBoy(name, point));
			showData();
		} else {
			System.out.println("새로운 점수로 갱신되었습니다");
			rm.lank4.set(index, new GameBoy(name, point));
			showData();
		}
	}
}