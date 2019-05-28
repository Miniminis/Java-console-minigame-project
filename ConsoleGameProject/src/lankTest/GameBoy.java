package lankTest;

import java.util.Collections;
import java.util.List;

public class GameBoy {

	
	RankTest rt = new RankTest();
	
	 String name;
	 int point;

	// 게임선택창에서 선택한 수를 가져와 담아줄 변수
	int check = 1;// 테스트용
	


	public GameBoy(String name2, int point2) {
		// TODO Auto-generated constructor stub
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
			rt.list = rt.rm.lank1;
			dataUp(rt.list);

			break;
		case 2:
			rt.list = rt.rm.lank2;
			dataUp(rt.list);
			break;
		case 3:
			rt.list = rt.rm.lank3;
			dataUp(rt.list);
			break;
		case 4:
			rt.list = rt.rm.lank4;
			dataUp(rt.list);
			break;

		}
	}

	
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
			//list.add(new GameBoy(name, point));
			list.add(new GameBoy(name, point));
			showData();
		} else {
			System.out.println("새로운 점수로 갱신되었습니다");
			//list.set(index, new GameBoy(name, point));
			list.set(index, new GameBoy(name, point));
			showData();
		}
	}
}