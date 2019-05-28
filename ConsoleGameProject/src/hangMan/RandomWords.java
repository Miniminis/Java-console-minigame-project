package hangMan;

import java.util.ArrayList;
import java.util.Collections;

class RandomWords {
	
		// 게임단어 랜덤돌리기 - 매 게임마다 정답 단어가 바뀐다
		String randomWord(int n) {
			int level = n;
			String rdWord = null;

			// 빠른 참조+shuffle 매서드 사용을 위해 list 저장방법 이용 
			ArrayList<String> gameWord1 = new ArrayList<String>();
			ArrayList<String> gameWord2 = new ArrayList<String>();
			ArrayList<String> gameWord3 = new ArrayList<String>();

			// 세자리수 단어
			gameWord1.add("ant");
			gameWord1.add("run");
			gameWord1.add("joy");
			gameWord1.add("fix");
			gameWord1.add("box");
			gameWord1.add("pig");
			gameWord1.add("wax");
			gameWord1.add("zoo");
			gameWord1.add("gym");
			gameWord1.add("six");

			// 다섯자리수 단어
			gameWord2.add("jelly");
			gameWord2.add("pizza");
			gameWord2.add("lucky");
			gameWord2.add("quick");
			gameWord2.add("crazy");
			gameWord2.add("field");
			gameWord2.add("mouse");
			gameWord2.add("japan");
			gameWord2.add("enjoy");
			gameWord2.add("paper");

			// 열자리수 단어
			gameWord3.add("mozzarella");
			gameWord3.add("jeopardize");
			gameWord3.add("chimpanzee");
			gameWord3.add("backpacker");
			gameWord3.add("complexity");
			gameWord3.add("experience");
			gameWord3.add("battleship");
			gameWord3.add("bankruptcy");
			gameWord3.add("expectance");
			gameWord3.add("emphasizes");

			switch (level) {
			case 3: // 3글자
				Collections.shuffle(gameWord1);
				rdWord = gameWord1.get(0);
				break;
			case 5: // 5글자
				Collections.shuffle(gameWord2);
				rdWord = gameWord2.get(0);
				break;
			case 10: // 10글자
				Collections.shuffle(gameWord3);
				rdWord = gameWord3.get(0);
				break;
			default:
				break;
			}

			return rdWord;
		}

}
