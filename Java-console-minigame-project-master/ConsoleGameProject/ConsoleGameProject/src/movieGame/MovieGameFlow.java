package movieGame;

import user.UserManager;

public class MovieGameFlow extends UserManager {

	public static void MovieGameMain(String id) {

		Game game = new Game();
		LevelOne one = new LevelOne();
		LevelTwo two = new LevelTwo();
		LevelThree three = new LevelThree();

		game.StartWord(id);
		int choice = 0;
		int cho = 0;

		while (true) {
			choice = game.showprint();
			System.out.println(choice);
			switch (choice) {

			// 한국영화
			case Util.KOREA_MOVIE:

				while (true) {
					cho = game.Level();

					switch (cho) {

					case 1:
						one.Korea1(id);
						break;
					case 2:
						two.Korea2(id);
						break;
					case 3:
						three.Korea3(id);
						break;
					case 4:
						System.out.println("이전단계로돌아갑니다");
						break;
					default:
						game.Print2();
						break;
					}
					if (cho == 4) {

						break;
					}
				}
				break;
			// 외국영화
			case Util.world_MOVIE:

				while (true) {

					cho = game.Level();
					switch (cho) {
					case 1:
						one.World1(id);
						break;
					case 2:
						two.World2(id);
						break;
					case 3:
						three.World3(id);
						break;
					case 4:
						System.out.println("이전단계로돌아갑니다");
						break;
					default:
						game.Print2();

						break;
					}
					if (cho == 4) {

						break;
					}
					break;
				}
				break;

			// 애니메이션 영화
			case Util.ani_MOVIE:

				while (true) {
					cho = game.Level();
					switch (cho) {
					case 1:
						one.ani1(id);
						break;
					case 2:
						two.ani2(id);
						break;
					case 3:
						three.ani3(id);
						break;
					case 4:
						System.out.println("이전단계로돌아갑니다");
						break;
					default:
						game.Print2();

						break;
					}
					if (cho == 4) {

						break;
					}
					break;
				}
				break;
			case 4:// 메인
				System.out.println("이전 메뉴로 돌아갑니다.");
				break;
			default:
				game.Print2();

				break;

			}
			if (choice == 4) {
				// break;
				return;
			}

		}
	}

}
