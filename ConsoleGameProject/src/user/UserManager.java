package user;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import movieGame.MovieGameFlow;
import util.Menu;
import util.Util;

public class UserManager {

	public static Map<String, UserInfo> userinfo = new HashMap<String, UserInfo>();

	/*
	 * public static UserInfoManager getInstance() {
	 * 
	 * if (m == null) { m = new UserInfoManager(); } return m;
	 * 
	 * }
	 * 
	 * private static UserInfoManager m = new UserInfoManager();
	 */

	// 메인메뉴 출력
	public static int printMainMenu() {

		// 메인메뉴
		System.out.println("=====================================");
		System.out.println("	      Main Menu");
		System.out.println("=====================================");
		System.out.printf("%d.로그인\n%d.회원가입\n%d.종료하기", Menu.LOGIN, Menu.MEMBER, Menu.QUIT);
		System.out.println("\n=====================================");

		int choice = 3;

		// 숫자가아닌 문자가 들어왔을 때
		checkInt();

		choice = Util.keyboard.nextInt();
		Util.keyboard.nextLine();

		return choice;
	}

	// 메인
	public static void mainMenu() throws IOException {
		while (true) {

			int choice = printMainMenu();

			switch (choice) {
			case Menu.LOGIN:// 로그인
				System.out.println("=====================================");
				System.out.println("		로그인");
				System.out.println("=====================================");
				login();
				break;
			case Menu.MEMBER:// 회원가입
				System.out.println("=====================================");
				System.out.println("	        회원가입");
				System.out.println("=====================================");
				joinMember();
				break;
			case Menu.QUIT:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("메뉴내에서 선택해주세요.");
			}

		}
	}

	// 로그인
	public static void login() throws IOException {

		System.out.print("아이디   : ");
		String id = Util.keyboard.nextLine();
		System.out.print("비밀번호 : ");
		String pw = Util.keyboard.nextLine();

		if (!(userinfo.containsKey(id))) {
			System.out.println("회원정보가 없습니다. \n회원가입해주세요.");

		} else if (userinfo.containsKey(id) && userinfo.get(id).getPassword().equals(pw)) {
			System.out.println("로그인되었습니다.");
			System.out.println(id + "님 환영합니다.");

			subMain(id);

		} else {
			System.out.println("아이디와 비밀번호를 확인해주세요.");
			login();
		}

	}

	// 회원가입
	public static void joinMember() {

		String id = null;

		while (true) {
			System.out.println("아이디를 입력해주세요.");
			id = Util.keyboard.nextLine();

			// id가 중복이아니라면 break;
			if (!(userinfo.containsKey(id))) {
				break;
			} else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}
		}

		System.out.println("비밀번호를 입력해주세요.");
		String pw = Util.keyboard.nextLine();

//		System.out.println("닉네임을 입력해주세요.");
//		String nName = Util.keyboard.nextLine();

		UserInfo ui = new UserInfo(id, pw);

		userinfo.put(ui.getId(), ui);

		System.out.println(id + "님 회원가입이 완료되었습니다.");

	}

	
	// 서브메뉴출력
//	public static void printSubMenu(String id) {
//
//		System.out.println("=====================================");
//		System.out.println("	      Sub Menu");
//		System.out.println("=====================================");
//		System.out.println("로그인 유저 : " + id);
//		// + "(" + userinfo.get(id).getNickname() + ")"
//		System.out.printf("%d.정보수정\n%d.내정보\n%d.게임하기\n%d.랭킹\n%d.로그아웃\n%d.회원탈퇴", Menu.L_UPDATE, Menu.L_INFO, Menu.L_GAME,
//				Menu.L_RANK, Menu.L_OUT, Menu.L_WITHDRAWAL);
//		System.out.println("\n=====================================");
//
//		// 숫자가아닌 문자가 들어왔을 때
//
//		subMain(id);
//
//	}


	// 서브메뉴관리
	public static void subMain(String id) throws IOException {

		while (true) {

	         System.out.println("=====================================");
	         System.out.println("              Sub Menu");
	         System.out.println("=====================================");
	         System.out.println("로그인 유저 : " + id);
	         System.out.printf("%d.내정보확인\n%d.비밀번호변경\n%d.게임하기\n%d.랭킹\n%d.로그아웃\n%d.회원탈퇴", Menu.L_INFO, Menu.L_UPDATE, Menu.L_GAME,
	               Menu.L_RANK, Menu.L_OUT, Menu.L_WITHDRAWAL);
	         System.out.println("\n=====================================");

	         int subChoice = Util.keyboard.nextInt();
	         Util.keyboard.nextLine();// 현재 라인의 버퍼를 출력(clear)
	      //   checkInt();
	         switch (subChoice) {
	         case Menu.L_UPDATE:// 정보수정
	            System.out.println("=====================================");
	            System.out.println("             비밀번호 변경");
	            System.out.println("=====================================");
	            updateInfo(id);
	            break;
	         case Menu.L_INFO:// 내정보
	            System.out.println("=====================================");
	            System.out.println("             내정보 보기");
	            System.out.println("=====================================");
	            myInfo(id);
	            break;
	         case Menu.L_GAME:// 게임하기
	            gameMain(id);
	            break;
	         case Menu.L_RANK:// 랭킹
	            System.out.println("=====================================");
	            System.out.println("              랭킹확인");
	            System.out.println("=====================================");
	            printRank(id);
	            break;
	         case Menu.L_OUT:// 로그아웃
	            System.out.println("로그아웃됩니다.");
	            //mainMenu();
	            break;
	         case Menu.L_WITHDRAWAL:// 회원탈퇴
	            deleteMember(id);
	            break;
	         default:
	            System.out.println("메뉴중에서 선택해주세요.");
	            break;
	         }
	         if(subChoice == Menu.L_OUT) {
	            break;
	         }
	      }

	}

	// 회원수정
	public static void updateInfo(String id) throws IOException {

		System.out.println("이전 비밀번호를 입력해주세요.");
	      System.out.println("이전화면으로 가려면 X입력");
	      String pw = Util.keyboard.nextLine();

	      if (userinfo.get(id).getPassword().equals(pw)) {
	         System.out.println("본인확인되었습니다.");
	         System.out.println("수정할 비밀번호를 입력해주세요.");
	         String newPw = Util.keyboard.nextLine();

	         UserInfo ui = new UserInfo(id, newPw);
	         userinfo.put(ui.getId(), ui);

	         System.out.println("수정되었습니다.");
	         subMain(id);
	      } else if (pw.toUpperCase().equals("X") || pw.toLowerCase().equals("x")) {
	         subMain(id);
	      } else {
	         System.out.println("잘못된 비밀번호입니다. 다시입력해주세요.");
	         System.out.println("이전으로 가려면 X입력");
	         updateInfo(id);
	      }
	}

	// 내정보보기
	public static void myInfo(String id) throws IOException {
		if (userinfo.get(id).getId().equals(id)) {

	         System.out.println("아 이 디 : " + id);
	         System.out.println("비밀번호 : " + userinfo.get(id).getPassword());
	         System.out.println("점    수 : " + userinfo.get(id).getScore() + "점");
	         
	      }
	      subMain(id);
	}

	// 게임하기
	
//
//		System.out.println("=====================================");
//		System.out.println("	        게임하기");
//		System.out.println("=====================================");
//		System.out.println("로그인 유저 : " + id);
//		System.out.printf("%d.행맨(HangMan) 게임\n%d.두번째 게임\n%d.세번째 게임\n%d.이전으로", Menu.FIRST_GAME, Menu.SECOND_GAME,
//				Menu.THIRD_GAME, Menu.BACK);
//		System.out.println("\n=====================================");
//
//		// 숫자가아닌 문자가 들어왔을 때
//
//		int GameChoice = Util.keyboard.nextInt();
//		Util.keyboard.nextLine();// 현재 라인의 버퍼를 출력(clear)

	

	// 게임관리
	public static void gameMain(String id) throws IOException {
		int GameChoice=0;
		while (true) {

			System.out.println("=====================================");
			System.out.println("	          게임하기");
			System.out.println("=====================================");
			System.out.println("로그인 유저 : " + id);
			System.out.printf("%d.억울한 사형수를 살려라! \n%d.영화제목을 맞춰라! \n%d.너와 나의 가위바위보\n%d.이전으로", Menu.FIRST_GAME, Menu.SECOND_GAME,
					Menu.THIRD_GAME, Menu.BACK);
			System.out.println("\n=====================================");

			// 숫자가아닌 문자가 들어왔을 때

			GameChoice = Util.keyboard.nextInt();
			Util.keyboard.nextLine();// 현재 라인의 버퍼를 출력(clear)

			switch (GameChoice) {
			case Menu.FIRST_GAME:// 첫번째게임
				hangMan.GameFlow.gameProcess(id);
				break;
			case Menu.SECOND_GAME:// 두번째게임
				MovieGameFlow.MovieGameMain(id);
				break;
			case Menu.THIRD_GAME:// 세번째게임

				break;
			case Menu.BACK:// 이전으로
				System.out.println("이전 메뉴로 돌아갑니다.");
				break;
			default:
				System.out.println("메뉴중에서 선택해주세요.");
				break;
			}
			if (GameChoice == Menu.BACK) {
				return;
			}
		}
	}

	// 랭킹
	public static void printRank(String id) {
		lankTest.RankTest.rank(id);
	}

	// 회원탈퇴
	public static void deleteMember(String id) throws IOException {
		System.out.println("회원탈퇴 하시겠습니까? (Y/N)");
		String answer = Util.keyboard.nextLine();

		if (answer.toUpperCase().equals("Y") || answer.toLowerCase().equals("y")) {
			System.out.println("수정 전 본인확인을 위해 비밀번호를 입력해주세요.");
			System.out.println("이전으로 가려면 X입력");

			while (true) {
				String pw = Util.keyboard.nextLine();

				if (userinfo.get(id).getPassword().equals(pw)) {
					System.out.println("본인확인되었습니다.");

					userinfo.remove(id);

					System.out.println("회원탈퇴되었습니다.");
					return;

					// x를 입력하면 대소문자 상관없이 이전으로 이동
				} else if (pw.toUpperCase().equals("X") || pw.toLowerCase().equals("x")) {
					subMain(id);
				} else {
					System.out.println("잘못된 비밀번호입니다. 다시 입력해주세요.");
					System.out.println("이전으로 가려면 X입력");
				}
			}

		} else if (answer.toUpperCase().equals("N") || answer.toLowerCase().equals("n")) {
			System.out.println("이전으로 돌아갑니다.");
			subMain(id);
		} else {
			System.out.println("Y 또는 N 로 대답해주세요.");
			deleteMember(id);
		}
	}

	// nextInt에 문자열이 들어오면 오류메세지 출력
	public static void checkInt() {
		while (!Util.keyboard.hasNextInt()) {
			Util.keyboard.next();
			System.err.println("메뉴내의 숫자를 입력해주세요.");
		}
	}

}
