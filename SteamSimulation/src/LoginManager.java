
public class LoginManager {

	public void login(Gamer gamer) {
		if ((gamer.tcNo != null) & gamer.birthDate > 18) {
			System.out.println(gamer.nickName + ", your account has been created and you registered.Enjoy ours game!");
		} else {
			System.out.println("You do not meet the verification requirements, check the accuracy of your information");
		}

	}

	public void loginDelete(Gamer gamer) {
		System.out.println(gamer.nickName + ", your account has been deleted");
	}

	public void loginUpdate(Gamer gamer) {
		if ((gamer.tcNo != null) & gamer.birthDate > 18) {
			System.out.println(gamer.nickName + " your account has been updated");
		} else {
			System.out.println("You do not meet the verification requirements, check the accuracy of your information");
		}

	}

}
