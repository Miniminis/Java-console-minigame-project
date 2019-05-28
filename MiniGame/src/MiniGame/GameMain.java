package MiniGame;


public class GameMain {

	public static void main(String[] args) {

		Game game = new Game();
		LevelOne one = new LevelOne();
		LevelTwo two = new LevelTwo();
		LevelThree three = new LevelThree();

		game.StartWord();
		int choice = 0;
		while (true) {
			choice = game.showprint();

			switch (choice) {

			case Util.KOREA_MOVIE:
				choice = game.Level();

				switch (choice) {
				
				case 1:
					one.Korea1();
					break;
				case 2:
					two.Korea2();
					break;

				case 3:
					three.Korea3();
					break;
				}
				
				
				break;

			case Util.world_MOVIE:
				choice = game.Level();

				switch (choice) {
				case 1:
					one.World1();
					break;
				case 2:
					two.World2();
					break;
				case 3:
					three.World3();
					break;
				}
				break;

			case Util.ani_MOVIE:
				choice = game.Level();
				
				switch (choice) {
				case 1:
					one.ani1();
					break;
				case 2:
					two.ani2();
					break;
				case 3:
					three.ani3();
					break;
				}
				break;

			}

		}
	}

}
