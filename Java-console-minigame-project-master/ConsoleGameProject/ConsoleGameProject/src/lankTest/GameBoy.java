package lankTest;

import java.util.Collections;
import java.util.List;

public class GameBoy   {

	public String name;
	public int point;
	RankTest lt= new RankTest();
	// 게임선택창에서 선택한 수를 가져와 담아줄 변수

	public GameBoy() {
	}

	public GameBoy(String name, int point) {
		this.name = name;
		this.point = point;
	}

	public void setInfo(String name, int point) {
		this.name = name;
		this.point = point;
	}

	public void showData() {
		System.out.println("=====================================");
		System.out.println("	      GAMEINFO");
		System.out.println("=====================================");
		System.out.println("이름 : " + name);
		System.out.println("점수 : " + point);
		System.out.println("=====================================");
	}

	public void saveData(int check) {
		// 게임 선택에서 고른수를 가져와 그 게임에 맞는 결과를 저장한다

		switch (check) {
		case 1:
			 lt.list = lt.rm.lank1;
			dataUp(lt.list);

			break;
		case 2:
			lt.list = lt.rm.lank2;
			dataUp(lt.list);
			break;
		case 3:
			lt.list = lt.rm.lank3;
			dataUp(lt.list);
			break;
		/*case 4:
			lt.list =lt. rm.lank4;
			dataUp(lt.list);
			break;
			*/
		}
	}
//점수갱신
	void dataUp(List<GameBoy> list) {
		int index = -1;
		Collections.sort(list, new Comprator());
		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).name) && point >= list.get(i).point) {
				index = i;
				break;
			}
		}
		if (index < 0) {
			System.out.println("정보가 저장되었습니다");
			list.add(new GameBoy(name, point));
			showData();
		} else {
			System.out.println("새로운 점수로 갱신되었습니다");
			list.set(index, new GameBoy(name, point));
			showData();
		}
	}
}