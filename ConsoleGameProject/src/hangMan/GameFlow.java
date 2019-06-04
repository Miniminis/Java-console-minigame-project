package hangMan;

import java.io.IOException;

import user.UserManager;

public class GameFlow extends UserManager {
	public static void gameProcess(String id) throws IOException {
		
		
		GameManager gm = new GameManager();

		
		System.out.println("minhee" + "님 게임을 선택해주세요. ");
		
	//	boolean check = false;
		
		
		while(true) {
		
			int choice = gm.startMenu(id);

			switch(choice) {
			case util.Menu.EASY: 
				System.out.println("초급게임을 시작합니다.");
				gm.gameStart(3);
				break;
			case util.Menu.INTERMEDIATE: 
				System.out.println("중급게임을 시작합니다.");
				gm.gameStart(5);
				break;
			case util.Menu.ADVANCED: 
				System.out.println("고급게임을 시작합니다.");
				gm.gameStart(7);
				break;
			case util.Menu.BACK: //뒤로가기
				System.out.println("이전 메뉴로 돌아갑니다.");
				break;
				//return;
				 //game(id);
			default : //
				System.out.println("적절한 선택을 해주세요. ");
			}
			
			if(util.Menu.BACK==choice) {
			break;
			}
		}
	}

}

/* 억울한 사형수를 살려라! (a.k.a. 행맨게임)
 * 0. 게임 시작 메뉴 입력 화면 
 * 1. 사용자의 단어 추측값 입력 - 정답단어와 대조하여 확인
 * while 반복문: tryCnt가 행맨의 신체부위 횟수보다 작을때까지 반복 
 * 1) 입력string이 있으면 --> "--a--" : 초기에 -로 표시되었던 단어의 빈칸이 해당 글자로 
 * 바뀌어 표현됨
 * - tryCnt --;
 * 2) 입력 string이 없으면 --> "-----" : 입력하신 단어가 없습니다. 
 * - 행맨의+bodyPart+가 사라집니다. 남은 횟수: --번 //(시간 있으면: 행맨 그림 표현)  
 * - tryCnt--;
 * 
 * /*answer 경우의 수: 
		 * 1) 길이가 1인 경우 
		 * - 문자가 입력된 경우 - 정답 대조 
		 * - 문자가 입력되지 않을 경우: 올바른 문자를 입력해주세요  
		 * 2) 길이가 1초과인 경우
		 * - 길이가 1초과 3이하 인 경우 - 정답 대조 
		 * - 길이가 3초과인 경우 - 올바른 단어를 입력해주세요. 
		 * 3) 길이가 1 미만인 경우  
		 * - 올바른 단어를 입력해주세요. 
 * 2. 행맨 지우기
 * - 오답일 때: 텍스트로 행맨의 없어진 신체부위 표시  (이후 수정: 행맨 그림 순차적으로 띄우기)
 * - 오답인 경우 - 행맨 매서드 연결   
 * 3. 게임단어 랜덤돌리기 
 * - 게임 단어리스트 - 배열로 일단 저장 (외부에서 불러올 방법 있으면 추가)
 * - 배열로 저장된 단어 랜덤으로 뽑아오기
 * 4. 힌트주기 (시간 있으면)  
 * - int hintCnt = 1; hintCnt--; 한 번의 힌트가 남아있습니다. 
 * - 정답 단어 중에 한 글자 알려주기: String, charAt() 
 * 5. 점수측정  
 *   */