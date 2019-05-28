package MiniGame;

import javax.swing.JOptionPane;

public class GameMain {

	public static void main(String[] args) {

		JOptionPane.showInputDialog("확인하세요");
		
		Game game = new Game();
		LevelOne one = new LevelOne();
		LevelTwo two = new LevelTwo();
		LevelThree three = new LevelThree();
		Back back = new Back();

		game.StartWord();
		int choice = 0;
		int cho = 0;

		while (true) {
			choice = game.showprint();

			switch (choice) {

			// 한국영화
			case Util.KOREA_MOVIE:

				while (true) {
					cho = game.Level();

					switch (cho) {

					case 1:
						
						one.Korea1();
						break;
					case 2:
						two.Korea2();
						break;
					case 3:
						three.Korea3();
						break;
					case 4:
						back.showprint();
					}
					break;
				}
				// 외국영화
			case Util.world_MOVIE:

				while (true) {
					cho = game.Level();
					switch (cho) {
					case 1:
						one.World1();
						break;
					case 2:
						two.World2();
						break;
					case 3:
						three.World3();
						break;
					case 4:
						back.showprint();
					}
					break;
				}
				//애니메이션 영화
			case Util.ani_MOVIE:

				while (true) {
					cho = game.Level();
					switch (cho) {
					case 1:
						one.ani1();
						break;
					case 2:
						two.ani2();
						break;
					case 3:
						three.ani3();
						break;
					case 4:
						back.showprint();
					}
					break;
				}
			}

		}
	}

}
