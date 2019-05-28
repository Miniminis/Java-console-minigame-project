package lankTest;

public class TestBoy extends GameBoy {

	String name = "점심국밥";
	int point = 89;
	int check = 1;

	@Override
	public void saveData(int check) {
		check = this.check;
		super.setInfo(this.name, this.point);
		super.saveData(check);
	}

}
