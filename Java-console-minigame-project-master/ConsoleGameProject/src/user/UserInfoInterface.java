package user;

public interface UserInfoInterface {

	//메인메뉴 출력
	int printMainMenu();
	
	//메인메뉴 관리
	void mainMenu();
	
	
	//로그인서비스
	void login();
	
	//회원가입
	void joinMember();
	
	//서브메뉴 출력(로그인에 필요했던 id와 닉네임을 가져옴)
	void printSubMenu(String id, String nName);
	
	//서브메뉴 관리(회원의 id와 메뉴에서 선택한 숫자를 받아옴)
	void subMain(int subChoice, String id);
	
	//회원정보 수정(회원의 id를 가져옴)
	void updateInfo(String id);
	
	//회원정보 보기 (회원에 id값에 따라 자기 정보만 보여짐)
	void myInfo(String id);
	
	
	//게임하기메뉴
	void game(String id);
	
	//게임관리
	void gameMain(int GameChoice, String id);
	
	
	//랭킹
	void rank();
	
	//회원탈퇴 (회원의 id값을 가져와 회원정보 삭제시킴)
	void deleteMember(String id);
	
	//각 메뉴에서 Integer값을 받아와야할때 문자열값을 넣으면 오류메세지 출력
	void checkInt();
	
	
}
