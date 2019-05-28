package MiniGame;

import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

public class LevelOne extends Game {

	Time time = new Time();
	

	// 한국영화 문제1
	public void Korea1() {
		System.out.println("난이도 초급 문제입니다.");
		System.out.println("[ㅇㅇㅇ ㅇ도]");
		System.out.println("힌트가 필요하시면 \"힌트\"를 입력해주세요. ");
		System.out.println("정답을 입력해주세요!");
		
//		JOptionPane.showInputDialog("확인하세요");
		
//		String answer = JOptionPane.showInputDialog("정답을 입력하세요 :");
		
		time.Timer();

		while (time.count < 60) {

			String answer = util.key.nextLine();
			
//			System.out.println("정답은? " + answer);
			

			if (answer.equals("연애의 온도")) {
				time.cancel();
				System.out.println("정답입니다!");
				System.out.println("---------");
				System.out.println("저장 된 점수는 : " + Point(0) + "점 입니다!");
				saveData();
				main();
				break;
			} else if (answer.equals("힌트")) {
				System.out.println("<힌트 : 출연배우 이민기, 김민희>");
			} else if (answer.equals("난 바보야")) {
				main();
			} else {
				System.out.println("틀렸습니다. 다시생각해보세요.");

			}
		}
	}

	// 외국영화 문제1
	public void World1() {
		System.out.println("난이도 초급 문제입니다.");
		System.out.println("[ㄹ라ㄹㄷ]");
		System.out.println("힌트가 필요하시면 \"힌트\"를 입력해주세요. ");
		System.out.println("정답을 입력해주세요!");
		time.Timer();

		while (time.count < 60) {

			
			String answer = util.key.nextLine();
			if (answer.equals("라라랜드")) {
				time.cancel();
				System.out.println("정답입니다!");
				System.out.println("저장 된 점수는 : " + Point(0) + "점 입니다!");
				saveData();
				main();
				break;
			} else if (answer.equals("힌트")) {
				System.out.println("<힌트 : 장르 뮤지컬,드라마,멜로/로맨스>");
			} else if (answer.equals("난 바보야")) {
				main();
			} else {
				System.out.println("틀렸습니다. 다시생각해보세요.");

			}
		}
	}

	// 애니영화 문제1
	public void ani1() {
		System.out.println("난이도 초급 문제입니다.");
		System.out.println("[ㄴㅁㄹ ㅊ아ㅅ]");
		System.out.println("힌트가 필요하시면 \"힌트\"를 입력해주세요. ");
		System.out.println("정답을 입력해주세요!");
		time.Timer();

		while (time.count < 60) {
			String answer = util.key.nextLine();
			if (answer.equals("니모를 찾아서")) {
				time.cancel();
				System.out.println("정답입니다!");
				saveData();
				main();
				break;
			} else if (answer.equals("힌트")) {
				System.out.println("<힌트 : 물고기>");
			} else if (answer.equals("난 바보야")) {
				main();
			} else {
				System.out.println("틀렸습니다. 다시생각해보세요.");
			}
		}
	}

	// 1점~30점 랜덤 점수
	public int Point(int num) {
		num = (int) (Math.random() * 30 + 1);
		return num;
	}

}
