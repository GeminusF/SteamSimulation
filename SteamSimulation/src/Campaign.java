import java.util.Scanner;

public class Campaign {

	static Scanner x = new Scanner(System.in);

	public static void addCampaign(Game game) {
		System.out.println("Current game's price : " + game.getPrice());
		System.out.println("Enter your discout price which gained disount code : ");
		double discount = x.nextDouble();
		if (game.getPrice() > discount) {
			game.setPrice(game.getPrice() - discount);
			System.out.println("Discounted game's price : " + game.getPrice());
		}else {
			System.out.println("The discount must be smaller than the price");
		}
	}

	public static void deleteCampaign(Game game) {
		System.out.println("Your discount deleted");
	}

	public static void updateCampaign(Game game) {
		System.out.println("Current game's price : " + game.getPrice());
		System.out.println("Enter your discout price which gained disount code : ");
		double discount = x.nextDouble();
		if (game.getPrice() > discount) {
			game.setPrice(game.getPrice() - discount);
			System.out.println("Discounted game's price : " + game.getPrice());
		}else {
			System.out.println("The discount must be smaller than the price");
		}
	}
}
