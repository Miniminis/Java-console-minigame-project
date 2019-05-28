package lankTest;

public class TestBoy  {
	String name = "점심국밥";
	int point = 89;
	int check=2;
	GameBoy gb=new GameBoy();

	public void saveData() {
		gb.name=name;
		gb.point=point;
		gb.saveData(check);
	}

}
