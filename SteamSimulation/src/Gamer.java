
public class Gamer extends EStateVerification {

	int id;
	double bankAccount;
	String nickName;
	Game games;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(double bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Game getGames() {
		return games;
	}

	public void setGames(Game games) {
		this.games = games;
	}

}
