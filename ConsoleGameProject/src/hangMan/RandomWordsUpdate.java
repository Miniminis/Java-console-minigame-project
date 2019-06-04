package hangMan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

class RandomWordsUpdate {

	// 게임단어 랜덤돌리기 - 매 게임마다 정답 단어가 바뀐다
	String randomWord(int n) throws IOException {
		int level = n;
		String rdWord = null;
		ArrayList<String> gameWord1 = new ArrayList<String>();
		ArrayList<String> gameWord2 = new ArrayList<String>();
		ArrayList<String> gameWord3 = new ArrayList<String>();

		// 외부 텍스트 파일로부터 단어를 읽어들이기 위한 bufferedreader instance 생성
		// gameWord1 - 3글자
		BufferedReader in = new BufferedReader(new FileReader(
				"C:\\Users\\user\\Documents\\GitHub\\Java-learning-2019\\ConsoleGameProject\\3letterwords.txt"));

		while (true) {
			gameWord1.add(in.readLine());
			if (in.readLine() == null) {
				break;
			}
		}
		in.close();

		// gameWord2 - 5글자
		BufferedReader in2 = new BufferedReader(new FileReader(
				"C:\\Users\\user\\Documents\\GitHub\\Java-learning-2019\\ConsoleGameProject\\5letterwords.txt"));
		while (true) {
			gameWord2.add(in2.readLine());
			if (in2.readLine() == null) {
				break;
			}
		}
		in2.close();

		// gameWord3 - 7글자
		BufferedReader in3 = new BufferedReader(new FileReader(
				"C:\\Users\\user\\Documents\\GitHub\\Java-learning-2019\\ConsoleGameProject\\7letterwords.txt"));
		while (true) {
			gameWord3.add(in3.readLine());
			if (in3.readLine() == null) {
				break;
			}
		}
		in3.close();

		switch (level) {
		case 3: // 3글자
			Collections.shuffle(gameWord1); // gameWord1 array 를 무작위로 shuffle
			rdWord = gameWord1.get(0); // shuffle된 array에서 첫번째 값 뽑기 --> 랜덤단어
			break;

		case 5: // 5글자 
			Collections.shuffle(gameWord2); 
			rdWord = gameWord2.get(0);
			break;
		case 7: // 7글자 
			Collections.shuffle(gameWord3); 
			rdWord = gameWord3.get(0);
			break;
		default:
			break;

		}

		return rdWord;
	}

}
