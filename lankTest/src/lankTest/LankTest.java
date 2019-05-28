package lankTest;

import java.util.InputMismatchException;
import java.util.List;

public class LankTest {
	static LanlManger rm = LanlManger.getInctance();
	static List<GameBoy> list;

	static TestBoy gab = new TestBoy();//테스트용
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 보고싶은 게임고르기
		
		gab.saveData(); // 테스트용
		int choice = 0;
		while (true) {

			list = null;

			choice = choiceMenu();

			switch (choice) {
			case 1:
				list = rm.lank1;
				rm.checkRank(list);
				break;
			case 2:
				list = rm.lank2;
				rm.checkRank(list);
				break;
			case 3:
				list = rm.lank3;
				rm.checkRank(list);
				break;

			case 4:
				list = rm.lank4;
				rm.checkRank(list);
				break;

			// 이전화면으로 돌아가기

			case 5: {
				System.out.println("EXIT RANK");
				break;
			}

			default:
				System.out.println("마! 똑바로 숫자 안 누르나 ! 팍 씨!");
				break;
			}
			// 이전 화면으로 돌아가기
			if (choice == 5) {
				break;

			}

		}
	}

	public static int choiceMenu() {
		int choice = 0;
		System.out.println("==RANKING CHECK==");
		System.out.println("1.FirstGame\n2.SecondGame\n3.ThirdGame\n4.Fourth Game\n5.EXIT RANK");
		// 예외처리 정수형 이외의 키를 입력할시 0을 리턴시켜 위 switch문에서 default를 실행시킨다.
		try {
			choice = GameBasic.key.nextInt();
		} catch (InputMismatchException e) {

		}
		GameBasic.key.nextLine();
		return choice;

	}

}
