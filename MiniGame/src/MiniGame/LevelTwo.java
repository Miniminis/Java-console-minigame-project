package MiniGame;


public class LevelTwo extends Game {
	
	Time time = new Time();


	public void Korea2() {
		System.out.println("난이도 중급 문제입니다.");
		System.out.println("[ㄴ ㅁㄹ ㅅㅇ ㅈㅇㄱ]");
		System.out.println("정답을 입력해주세요. \"힌트\"가 필요하시면 힌트를 입력해주세요. ");

		while (time.count < 60) {

			time.Timer();
			String answer = util.key.nextLine();

			if (answer.equals("내 머리 속의 지우개")) {
				time.cancel();
				System.out.println("정답입니다!");
				System.out.println("저장 된 점수는 :" + Point2(0) + "점 입니다.");
				saveData();
				main();
			} else if (answer.equals("힌트")) {
				System.out.println("<힌트 : 출연배우 이민기, 김민희>");
			} else if (answer.equals("난 바보야")) {
				main();
			} else {
				System.out.println("틀렸습니다. 다시생각해보세요.");

			}
		}

	}

	public void World2() {
		System.out.println("난이도 중급 문제입니다.");
		System.out.println("[ㅋㅅㅁ]");
		System.out.println("정답을 입력해주세요. \"힌트\"가 필요하시면 힌트를 입력해주세요. ");

		while (time.count < 60) {

			time.Timer();
			String answer = util.key.nextLine();
			if (answer.equals("킹스맨")) {
				time.cancel();
				System.out.println("정답입니다!");
				System.out.println("저장 된 점수는 :" + Point2(0) + "점 입니다.");
				saveData();
				main();
			} else if (answer.equals("힌트")) {
				System.out.println("<힌트 : 출연배우 이민기, 김민희>");
			} else if (answer.equals("난 바보야")) {
				main();
			} else {
				System.out.println("틀렸습니다. 다시생각해보세요.");

			}
		}
	}

	public void ani2() {
		System.out.println("난이도 중급 문제입니다.");
		System.out.println("[ㅇㅅㅇㄷ ㅇㅇ]");
		System.out.println("정답을 입력해주세요. \"힌트\"가 필요하시면 힌트를 입력해주세요. ");

		while (time.count < 60) {

			time.Timer();
			String answer = util.key.nextLine();
			if (answer.equals("인사이드 아웃")) {
				time.cancel();
				System.out.println("정답입니다!");
				System.out.println("저장 된 점수는 :" + Point2(0) + "점 입니다.");
				saveData();
				main();
			} else if (answer.equals("힌트")) {
				System.out.println("<힌트 : 출연배우 이민기, 김민희>");
			} else if (answer.equals("난 바보야")) {
				main();
			} else {
				System.out.println("틀렸습니다. 다시생각해보세요.");

			}
		}
	}
    //30점~50점 랜덤 점수
	public int Point2(int num2) {
		num2 = (int) (Math.random() * (21) + 30);
		return num2;
	}

}
