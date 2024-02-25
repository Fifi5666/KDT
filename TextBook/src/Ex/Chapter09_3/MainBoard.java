package Ex.Chapter09_3;

public class MainBoard {
	
	public static void main(String[] args) {
		Player player = new Player();	// 처음 생성하면 BeginnerLevel
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);	// 매개변수로 받아온 레벨로 업그레이드
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
	}

}
