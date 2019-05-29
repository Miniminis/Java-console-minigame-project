package util;

public interface Menu {
	
	//메인메뉴
	int LOGIN = 1;
	int MEMBER = 2;
	int QUIT = 3;

	//서브메뉴
	int L_INFO = 1;
	int L_UPDATE = 2;
	int L_GAME = 3;
	int L_RANK = 4;
	int L_OUT = 5;
	int L_WITHDRAWAL = 6;
	
	
	//게임메뉴
	int FIRST_GAME = 1;
	int SECOND_GAME = 2;
	int THIRD_GAME = 3;
	int BACK = 4;
	
	
	//HangMan 메뉴
	//게임 난이도 선택지
	int EASY = 1, INTERMEDIATE = 2, ADVANCED = 3;

	// 게임 이후 메뉴 선택지
	int KEEPGAME = 1, GOTOMAIN = 2;
		
}