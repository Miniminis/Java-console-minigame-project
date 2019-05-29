package MiniGame;

public class LevelOne extends Game {

	Time time = new Time();
	

	// 한국영화 문제1
	public void Korea1() {
		System.out.println("난이도 초급 문제입니다.");
		System.out.println("[ㅇㅇㅇ ㅇ도]");
		answer2();//출력메소드
		
		
		time.Timer();

		while (time.count < 60) {

			String answer = util.key.nextLine();

			if (answer.equals("연애의 온도")) {
				time.cancel();
				saveData();
				answer();//정답시 출력 메소드
				main();
				break;
			} else if (answer.equals("힌트")) {
				System.out.println("<힌트 : 출연배우 이민기, 김민희>");
			} else if (answer.equals("난 바보야")) {
				main();
			} else {
				WrongAnswer();//틀렸을시 출력 메소드

			}
		}
	}

	// 외국영화 문제1
	public void World1() {
		System.out.println("난이도 초급 문제입니다.");
		System.out.println("[ㄹ라ㄹㄷ]");
		answer2();//출력 메소드
		time.Timer();

		while (time.count < 60) {

			
			String answer = util.key.nextLine();
			if (answer.equals("라라랜드")) {
				time.cancel();
				answer();//정답 메소드
				saveData();
				main();
				break;
			} else if (answer.equals("힌트")) {
				System.out.println("<힌트 : 장르 뮤지컬,드라마,멜로/로맨스>");
			} else if (answer.equals("난 바보야")) {
				main();
			} else {
				WrongAnswer(); //틀렸을때 출력 메소드

			}
		}
	}

	// 애니영화 문제1
	public void ani1() {
		System.out.println("난이도 초급 문제입니다.");
		System.out.println("[ㄴㅁㄹ ㅊ아ㅅ]");
		answer2();//출력 메소드
		time.Timer();

		while (time.count < 60) {
			String answer = util.key.nextLine();
			if (answer.equals("니모를 찾아서")) {
				time.cancel();
				answer(); //정답 메소드
				saveData();
				main();
				break;
			} else if (answer.equals("힌트")) {
				System.out.println("<힌트 : 물고기>");
			} else if (answer.equals("난 바보야")) {
				main();
			} else {
				WrongAnswer(); // 틀렸을때 메소드
			}
		}
	}
	// 1점~30점 랜덤 점수
		public int Point(int num) {
			num = (int) (Math.random() * 30 + 1);
			return num;
		}
		// 정답 출력메소드
		public void answer() {
			System.out.println("정답입니다!");
			System.out.println("---------");
			System.out.println("저장 된 점수는 : " + Point(0) + "점 입니다!");
		}

	

}
