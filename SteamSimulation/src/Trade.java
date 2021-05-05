
public class Trade {

	public static void buyGame(Game game, Gamer gamer) {

		if (gamer.getBankAccount() - game.getPrice() >= 0) {
			gamer.setBankAccount(gamer.getBankAccount() - game.getPrice());
			gamer.setGames(game);
			System.out.println(gamer.getNickName() + " ,buy " + game.getName() + " enjoy your game! ");
			System.out.println("Current acount : " + gamer.getBankAccount());
		} else {
			System.out.println("ups! The amount you will receive the game is not in your account");
			System.out.println("Current acount : " + gamer.getBankAccount());
			System.out.println("Game price : " + game.price);
		}

	}
	
}
