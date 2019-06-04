package hangMan;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import lankTest.GameBoy;
import user.UserInfo;
import user.UserManager;
import util.Util;

public class GameManager extends UserManager{


	String name;
	int point;
	int check = 1;
	
	
	GameBoy gb = new GameBoy();


	// 0. 게임 시작 메뉴 입력 화면
	public int startMenu(String id) { //getId		
		
	    this.name = userinfo.get(id).getId(); 
	    this.point =userinfo.get(id).getScore();
		 
		
		int choice = 0;
		System.out.println("=====================================");
		System.out.println("	      HangmanGame Menu");
		System.out.println("=====================================");
		System.out.println("minhee" + " 님 환영합니다*^^*");
		System.out.println("게임의 난이도를 선택해주세요.");
		System.out.println("1) 초급 2) 중급 3) 고급 4) 뒤로가기");
		System.out.println("=====================================");

		// 유저의 메뉴입력
		try {
			choice = Util.keyboard.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("1-4번 사이의 번호를 입력해주세요. ");
		}
		Util.keyboard.nextLine();
		return choice;
		
	}

	void gameStart(int n) throws IOException {

		// random words 인스턴스 생성
		//RandomWords rdw = new RandomWords();
		
		//update(2019.06.04): 외부 text file로부터 읽어들인 rdwUp 인스턴스 생성
		RandomWordsUpdate rdwUp = new RandomWordsUpdate();
		
		
		String correctAnswer = rdwUp.randomWord(n); // 랜덤 키워드로부터 길이가 n인 정답단어 축출 
		char[] correctAnswerArray = correctAnswer.toCharArray(); // 단어의 각 알파벳 대조를 위해 char array 생성 
		char[] blank = new char[correctAnswerArray.length]; // 단어 자리수 표시를 위한 공백 array 
		for (int i = 0; i < correctAnswerArray.length; i++) { 
			blank[i] ='_'; 
		}		

		int failCnt = 0; // 유저의 오답 횟수

		while ((12 - failCnt) > 0) { // (행맨 신체부위 12개 - 실패횟수): 남아있는 기회

			// 완성된 입력단어와 정답단어 비교
			if (correctAnswer.equals(String.valueOf(blank))) {
				System.out.println("당신은 천재이군요!");
				break;
			}
	        System.out.println("=====================================");
			System.out.println("빈 칸에 들어갈 알맞은 알파벳을 입력해주세요. \n(***게임 중단을 원하시면 5번을 눌러주세요***)");
			System.out.println("=====================================");
			for (int i = 0; i < correctAnswerArray.length; i++) { // 유저화면에 빈칸 array 표시 - 자릿수 표시
				System.out.print(blank[i] + " ");
			}

			// 사용자 정답 입력 = answer
			Scanner sc = new Scanner(System.in);
			String answer = sc.nextLine();
			int ansLen = answer.length();

			// 유저가 게임 중단을 선택할때
			if (answer.equals("5")) {
				failCnt=12;
				break;
				//afterGame(failCnt);
			}

			// 제한 범위 외의 입력값/중복알파벳/한글이외의 입력값에 대한 예외처리
			if ((ansLen < 1 || ansLen > n)) {
				System.out.println("올바른 단어를 입력해주세요. ");
			}

			// 유저가 알파벳을 입력한 경우
			if (ansLen == 1) {

				boolean success = false; // 유저의 정답 여부

				// 정답단어 == 유저입력 알파벳
				for (int i = 0; i < correctAnswerArray.length; i++) {
					if (correctAnswerArray[i] == answer.charAt(0)) {
						System.out.println("입력하신 알파벳은 정답 단어에 포함되어 있습니다. ");
						blank[i] = answer.charAt(0);
						success = true; // 추측성공시 true 반환
					}
				}

				// 정답단어 != 유저입력 알파벳
				if (success != true) {
					failCnt++;
					System.out.println("=====================================");
					System.out.println("남은 횟수: " + (12 - failCnt));
					System.out.println("억울한 사형수의 " + deleteHangMan(12 - failCnt) + "이/가 사라집니다.");
					System.out.println("=====================================");
				}

				// 힌트제공 (failCnt == 3, 6, 9)
				if (failCnt == 3) {
					System.out.println("너무 못하셔서 힌트를 드릴게요. ");
					blank[0] = correctAnswer.charAt(0);
				} else if (failCnt == 6) {
					System.out.println("너무 못하셔서 힌트를 드릴게요. ");
					blank[2] = correctAnswer.charAt(2);
				} else if (failCnt == 9) {
					System.out.println("너무 못하셔서 힌트를 드릴게요. ");
					blank[1] = correctAnswer.charAt(1);
				}

				// 유저가 단어(문자열)로 입력한 경우
			} else {

				if (correctAnswer.equals(answer)) {
					System.out.println("당신은 천재이군요! 정답입니다.");
					break;
				} else {
					System.out.println("정답이 아닙니다.");
					failCnt++;
					System.out.println("남은 횟수: " + (12 - failCnt));
					System.out.println("억울한 사형수의 " + deleteHangMan(12 - failCnt) + "이/가 사라집니다.");
				}

			}

		}
		gamePoint(failCnt);
		afterGame(failCnt);
	}

	// 게임 완료 후 메뉴 선택지
	void afterGame(int failCnt) {

		while (true) {

			System.out.println("=====================================");
			System.out.println("	    After Hangman Game");
			System.out.println("=====================================");
			System.out.println("게임이 끝났습니다. 메뉴를 선택해주세요. ");
			System.out.printf("\n%d) 게임 다시하기 \n%d) 이전으로 돌아가기", util.Menu.KEEPGAME, util.Menu.GOTOMAIN);
			System.out.println("\n=====================================");
			int choice = Util.keyboard.nextInt();
			Util.keyboard.nextLine();

			switch (choice) {
			case util.Menu.KEEPGAME: // 게임 계속하기
				break;
			case util.Menu.GOTOMAIN: // 메인으로 돌아가기2			
				// 메인 클래스와 연결
				return;
			default:
				System.out.println("메뉴를 다시 선택해주세요. ");
				break;
			}
			
			if(util.Menu.GOTOMAIN==choice) {
				break;
			}
		}
	}

	// 행맨 지우기
	String deleteHangMan(int n) {
		int restCnt = n;
		String hangManStatus;

		// 행맨의 신체 부위 개수는 고정되어있으므로 수정이 많지 않음 --> 일반 배열을 사용
		String[] hangMan = new String[] { "목", "눈썹", "머리카락", "몸통", "왼팔", "오른팔", "왼쪽 다리", "오른쪽 다리", "왼쪽 손", "오른쪽 손",
				"왼쪽 발", "오른쪽 발", };

		hangManStatus = hangMan[restCnt];
		return hangManStatus;

	}

	// 점수 매서드
	void gamePoint(int n) {
		int gamePoint = point;
		int failCnt = n;
		if (failCnt <= 1) {
			gamePoint = 100;
		} else if (failCnt <= 4) { // failCnt>1 && failCnt<=4 --> 이미 if 절에서 failCnt>1 의 조건을 제외시켰기 때문에 생략이 가능
			gamePoint = 90;
		} else if (failCnt <= 7) {
			gamePoint = 80;
		} else if (failCnt <= 10) {
			gamePoint = 70;
		} else {
			gamePoint = 0;
		}
		
		savePoint(gamePoint);
	}

	
	// 유저-게임포인트 저장 메서드
	public void savePoint(int point) {
		gb.name=name;
		gb.point=point;
		gb.saveData(check);
	}


}
