package MiniGame;

import java.util.HashMap;
import java.util.Map;

public class test {

	Map<Integer, String> Question = new HashMap<Integer, String>();

	public void level() {
		Question.put(1, "연애의 온도");
		Question.put(2, "내 머리 속의 지우개");
		Question.put(3, "웰컴 투 동막골");

		Question.put(4, "라라랜드");
		Question.put(5, "킹스맨");
		Question.put(6, "찰리와 초콜릿 공장");

		Question.put(7, "니모를 찾아서");
		Question.put(8, "인사이드 아웃");
		Question.put(9, "아이스에이지");

		Question.put(10, "<힌트 : 출연배우 이민기, 김민희>");
		Question.put(11, "<힌트 : 출연배우 정우성>");
		Question.put(12, "<힌트 : 키워드 전쟁, 팝콘>");

		Question.put(13, "<힌트 : 장르 뮤지컬,드라마,멜로/로맨스>");
		Question.put(14, "<힌트 : 매너가 사람을 만든다>");
		Question.put(15, "<힌트 : 출연배우 조니 뎁>");

		Question.put(16, "<힌트 : 물고기>");
		Question.put(17, "<힌트 : 감정>");
		Question.put(18, "<힌트 : 도토리>");

	}

	public void answer() {
		System.out.println("정답입니다!");
		System.out.println("---------");
		System.out.println("저장 된 점수는 : " + Point(0) + "점 입니다!");
	}
	public void WrongAnswer() {
		System.out.println("틀렸습니다. 다시생각해보세요.");
	}
	public void answer2() {
		System.out.println("힌트가 필요하시면 \"힌트\"를 입력해주세요. ");
		System.out.println("정답을 입력해주세요!");
	}

	// 1점~30점 랜덤 점수
	public int Point(int num) {
		num = (int) (Math.random() * 30 + 1);
		return num;
	}

	// 30점~50점 랜덤 점수
	public int Point2(int num2) {
		num2 = (int) (Math.random() * (21) + 30);
		return num2;
	}

	// 50~70점 랜덤 점수
	public int Point3(int num3) {
		num3 = (int) (Math.random() * (21) + 50);
		return num3;
	}

}
