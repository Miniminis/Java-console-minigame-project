package hangMan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainHangMan {

	public static void main(String[] args) throws IOException {

		/*
		 * GameFlow gameFlow = new GameFlow();
		 * 
		 * System.out.println("게임을 선택해주세요. "); gameFlow.gameProcess();
		 */
		
		// 게임단어 랜덤돌리기 - 매 게임마다 정답 단어가 바뀐다
					String rdWord = null;
					
					//외부 텍스트 파일로부터 단어를 읽어들이기 위한 bufferedreader instance 생성
					BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\user\\eclipse-workspace\\ConsoleGameProject\\3letterwords.txt"));
					while(true) {
						rdWord = in.readLine();
						if(rdWord==null) {
							break;
						}
						System.out.println(rdWord);
					}
					in.close();
					
				/*
				 * switch (level) { case 3: // 3글자
				 * 
				 * Collections.shuffle(gameWord1); rdWord = gameWord1.get(0); break; case 5: //
				 * 5글자 Collections.shuffle(gameWord2); rdWord = gameWord2.get(0); break; case
				 * 10: // 10글자 Collections.shuffle(gameWord3); rdWord = gameWord3.get(0); break;
				 * default: break; }
				 */

	}
}



/*
 * [우리동네 오락실] 
 * 1 로그인 or 회원가입? - 중복 유저 차단
 *
 * 2 로그인 - 유저확인 1) 회원정보 수정 2) 내정보보기 3) 게임하기 4) 랭킹확인 점수: 100점만점으로 10점 단위씩 5) 로그아웃
 * - 초기화면으로 전환 6) 회원탈퇴
 * ================================================================= 
 * 3) 게임하기 ***객체 개념 활용하여 구조잡기 
 * 1. 행맨 
 * - 게임을 시작합니다. 난이도 선택 1) 초급 2) 중급 3) 고급 
 * - 게임 하기  - 게임결과 저장 
 * - 소메뉴 선택) 1. 게임 계속하기 2. 랭킹확인하기 - 4) 랭킹과 연결 3) 메인 돌아가기 4) 게임종료 
 * 
 * 2. 영화 훈민정음
 * - 게임을 시작합니다. 주제선택
 * - 게임 하기 
 * - 게임결과 저장 - 소메뉴 선택) 1. 게임 계속하기 2. 랭킹확인하기 3) 메인 돌아가기
 * 
 * 3. 끝말잇기 (컴퓨터와 대전) 
 * - 게임을 시작합니다: 
 * - 게임 하기 
 * - 게임결과 저장 - 소메뉴 선택) 1. 게임 계속하기 2 랭킹확인하기 3) 메인 돌아가기
 * 
 * 
 * 4. 숫자야구 *** 컴퓨터와 대전: 승패에 관한 규칙 추가 
 * - 게임을 시작합니다: 주제정하기 
 * - 게임 하기 - 게임 시도 횟수 제한 
 * - 게임결과 저장 - 소메뉴 선택) 1. 게임 계속하기 2. 랭킹확인하기 3) 메인 돌아가기 
 * =============================================================================
 * 4) 랭킹확인 - 이름검색기능 추가
 */
