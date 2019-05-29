package user;

public class UserInfo {

	private String id;		//아이디
	private String password;//비밀번호
	//private String nickname;//닉네임
	private int score;//점수

	// 생성자를 통한 변수 초기화
	public UserInfo(String id, String pw, int score) {

		this.id = id;
		this.password = pw;
		//this.nickname = nName;
		this.score = score;

	}

	//점수 0으로 초기화
	public UserInfo(String id, String pw) {

		this(id, pw, 0);

	}
	
	
	public UserInfo(String id, int score) {

		this.id = id;
		this.score = score;
	}
	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


//	public String getNickname() {
//		return nickname;
//	}
//
//
//	public void setNickname(String nickname) {
//		this.nickname = nickname;
//	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}
	
	
}
