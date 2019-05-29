package networkreal;


class Game {
	
	private int count = 0; //게임횟수
	private int score = 0; //점수획득누적
	private String num;
	
	//첫시작
	void gamePrint() {
		System.out.println("==========================");
		System.out.println("가위바위보!!");
		System.out.println("==========================");
		System.out.println("가위바위보 게임에 오신 것을 환영합니다.");
		System.out.println("가위는 1, 바위는 2, 보는 3입니다.");
	}
	
	
	void rcpGame(String user) {
		
		
			num = Integer.toString((int) ((Math.random() * 3) + 1)); 

			count++;

			if (user.equals("1")) {
				if (num.equals("1")) {
					System.out.println("서버 : " + num);
					System.out.println("클라이언트 : " + user);
					System.out.println("서로 비겼습니다.");
				} else if (num.equals("2")) {
					System.out.println("서버 : " + num);
					System.out.println("클라이언트 : " + user);
					System.out.println("클라이언트가 졌습니다.");
				} else {
					System.out.println("서버 : " + num);
					System.out.println("클라이언트 : " + user);
					System.out.println("클라이언트가 이겼습니다.");
					score = score + 30;
				}
			} else if (user.equals("2")) {
				if (num.equals("1")) {
					System.out.println("서버 : " + num);
					System.out.println("클라이언트 : " + user);
					System.out.println("클라이언트가 이겼습니다.");
					score = score + 30;
				} else if (num.equals("2")) {
					System.out.println("서버 : " + num);
					System.out.println("클라이언트 : " + user);
					System.out.println("서로 비겼습니다.");
				} else {
					System.out.println("서버 : " + num);
					System.out.println("클라이언트 : " + user);
					System.out.println("클라이언트가 졌습니다.");
				}
			} else if (user.equals("3")) {
				if (num.equals("1")) {
					System.out.println("서버 : " + num);
					System.out.println("클라이언트 : " + user);
					System.out.println("클라이언트가 졌습니다.");
				} else if (num.equals("2")) {
					System.out.println("서버 : " + num);
					System.out.println("클라이언트 : " + user);
					System.out.println("클라이언트가 이겼습니다.");
					score = score + 30;
				} else {
					System.out.println("서버 : " + num);
					System.out.println("클라이언트 : " + user);
					System.out.println("서로 비겼습니다.");

				}

			} else {
				System.out.println("가위바위보중에서 입력해주세요.");
				count--;
			}
		}

	

	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	
}
