package lankTest;

import java.util.Comparator;

//소트정렬을 위한 클래스
class Comprator implements Comparator<GameBoy> {
	
	@Override
	public int compare(GameBoy o1, GameBoy o2) {
		return o2.point  - o1.point ;
	}
	
}