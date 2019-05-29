package MiniGame;

public class test2 extends Game {
	
		

	Time time = new Time();
	test test = new test();

	public void KoreaMovie() {
		System.out.println("난이도 초급 문제입니다.");
		System.out.println("[ㅇㅇㅇ ㅇ도]");
//		System.out.println("힌트가 필요하시면 \"힌트\"를 입력해주세요. ");
//		System.out.println("정답을 입력해주세요!");
		test.answer2();
		time.Timer();

		while (time.count < 60) {
			
			String answer = util.key.nextLine();
			
			if(answer.equals("연애의 온도")) {
				time.cancel();
				test.answer();
				saveData();
				main();
				break;
			}else if(answer.equals("힌트")){
				System.out.println(test.Question.get(1));
			}else if(time.count == 0) {
				main();
				break;
			}else {
				test.WrongAnswer();
			}

		}

	}
}
