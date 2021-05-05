
public class Main {

	public static void main(String[] args) {

		Game game1 = new Game();
		game1.setGameId(1);
		game1.setName("AC Unity");
		game1.setGenre("Stealth,Action");
		game1.setPlatform("Windows10");
		game1.setPublisherOrDeveloper("Ubisoft");
		game1.setPrice(35);

		Game game2 = new Game();
		game2.setGameId(2);
		game2.setName("AC Rogue");
		game2.setGenre("Stealth,Action");
		game2.setPlatform("Playstation 4");
		game2.setPublisherOrDeveloper("Ubisoft");
		game2.setPrice(40);

		Game game3 = new Game();
		game3.setGameId(3);
		game3.setName("AC Black Flag");
		game3.setGenre("Stealth,Action");
		game3.setPlatform("Xbox 0ne");
		game3.setPublisherOrDeveloper("Ubisoft");
		game3.setPrice(50);

		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setNickName("GeminusF");
		gamer.setBankAccount(100);
		gamer.birthDate = 19;
		gamer.tcNo = "12312";

		LoginManager loginManager = new LoginManager();

		loginManager.login(gamer);
		System.out.println("-----------");

		loginManager.loginUpdate(gamer);
		System.out.println("-----------");

		loginManager.loginDelete(gamer);
		System.out.println("-----------");

		System.out.println(gamer.getBankAccount());
		System.out.println("-----------");

		Campaign.addCampaign(game3);
		System.out.println("-----------");

		Trade.buyGame(game3, gamer);

	}

}
