package lankTest;

public class TestBoy extends GameBoy {
	String name = "점심국밥";
	int point = 89;
	int FirstGame=2;


	@Override
	public void saveData(int check) {
		check=FirstGame;
		super.setInfo(this.name, this.point);
		super.saveData(check);
	}

}
