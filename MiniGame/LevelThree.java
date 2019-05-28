package MiniGame;

public class LevelThree extends Game {

	Time time = new Time();

	// 한국영화 문제3
	public void Korea3() {
		System.out.println("난이도 고급 문제입니다.");
		System.out.println("[ㅇㅋㅌㄷㅁㄱ]");
		System.out.println("힌트가 필요하시면 \"힌트\"를 입력해주세요. ");
		System.out.println("정답을 입력해주세요!");
		time.Timer();

		while (time.count < 60) {
			String answer = util.key.nextLine();
			if (answer.equals("웰컴 투 동막골")) {
				time.cancel();
				System.out.println("저장 된 점수는 : " + Point3(0) + "점 입니다!");
				saveData();
				main();
				break;
			} else if (answer.equals("힌트")) {
				System.out.println("<힌트 : 키워드 전쟁, 팝콘>");
			} else if (answer.equals("난 바보야")) {
				main();
			} else {
				System.out.println("틀렸습니다. 다시생각해보세요.");

			}
		}
	}

	// 외국영화 문제3
	public void World3() {
		System.out.println("난이도 고급 문제입니다.");
		System.out.println("[ㅊㄹㅇㅊㅋㄹㄱㅈ]");
		System.out.println("힌트가 필요하시면 \"힌트\"를 입력해주세요. ");
		System.out.println("정답을 입력해주세요!");
		time.Timer();

		while (time.count < 60) {
			String answer = util.key.nextLine();
			if (answer.equals("찰리와 초콜릿 공장")) {
				time.cancel();
				System.out.println("저장 된 점수는 : " + Point3(0) + "점 입니다!");
				saveData();
				main();
				break;
			} else if (answer.equals("힌트")) {
				System.out.println("<힌트 : 출연배우 조니 뎁>");
			} else if (answer.equals("난 바보야")) {
				main();
			} else {
				System.out.println("틀렸습니다. 다시생각해보세요.");

			}
		}
	}

	// 애니영화 문제3
	public void ani3() {
		System.out.println("난이도 고급 문제입니다.");
		System.out.println("[ㅇㅇㅅㅇㅇㅈ]");
		System.out.println("힌트가 필요하시면 \"힌트\"를 입력해주세요. ");
		System.out.println("정답을 입력해주세요!");
		time.Timer();

		while (time.count < 60) {

			String answer = util.key.nextLine();

			if (answer.equals("아이스에이지")) {
				time.cancel();
				System.out.println("저장 된 점수는 : " + Point3(0) + "점 입니다!");
				saveData();
				main();
				break;
			} else if (answer.equals("힌트")) {
				System.out.println("<힌트 : 도토리>");
			} else if (answer.equals("난 바보야")) {
				main();
			} else {
				System.out.println("틀렸습니다. 다시생각해보세요.");

			}
		}
	}

	// 50~70점 랜덤 점수
	public int Point3(int num3) {
		num3 = (int) (Math.random() * (21) + 50);
		return num3;
	}

}