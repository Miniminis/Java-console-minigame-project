package movieGame;

public class LevelTwo extends Game {

	Time time = new Time();

	// 한국영화 문제2
	public void Korea2(String id) {
		System.out.println("난이도 중급 문제입니다.");
		System.out.println("[ㄴ ㅁㄹ ㅅㅇ ㅈㅇㄱ]");
		answer2(); // 출력 메소드
		time.Timer();

		while (true) {
			String answer = util.key.nextLine();

			if (answer.equals("내 머리 속의 지우개")) {
				time.cancel();
				answer(id);// 정답 메소드
				break;
			} else if (answer.equals("힌트")) {
				System.out.println("<힌트 : 출연배우 정우성>");
			} else if (answer.equals("난 바보야")) {
				break;
			} else {
				WrongAnswer();// 틀렸을때 출력 메소드

			}
		}

	}

	// 외국영화 문제2
	public void World2(String id) {
		System.out.println("난이도 중급 문제입니다.");
		System.out.println("[ㅋㅅㅁ]");
		answer2();// 출력 메소드
		time.Timer();

		while (true) {
			String answer = util.key.nextLine();
			if (answer.equals("킹스맨")) {
				time.cancel();
				answer(id);// 정답메소드
				break;
			} else if (answer.equals("힌트")) {
				System.out.println("<힌트 : 매너가 사람을 만든다>");
			} else if (answer.equals("난 바보야")) {
				break;
			} else {
				WrongAnswer();// 틀렸을때 출력 메소드

			}
		}
	}

	// 애니영화 문제1
	public void ani2(String id) {
		System.out.println("난이도 중급 문제입니다.");
		System.out.println("[ㅇㅅㅇㄷ ㅇㅇ]");
		answer2();// 출력메소드
		time.Timer();

		while (true) {
			String answer = util.key.nextLine();
			if (answer.equals("인사이드 아웃")) {
				time.cancel();
				answer(id);// 정답메소드
				break;
			} else if (answer.equals("힌트")) {
				System.out.println("<힌트 : 감정>");
			} else if (answer.equals("난 바보야")) {
				break;
			} else {
				WrongAnswer();// 틀렸을때 출력 메소드

			}
		}
	}

	// 30점~50점 랜덤 점수
	public int Point2(int num2) {
		num2 = (int) (Math.random() * (21) + 30);
		return num2;
	}

	// 정답 출력메소드
			public void answer(String id) {
				System.out.println("정답입니다!");
				
				savePoint(id, Point2(0));
				

			}

}
