import java.util.Scanner;

public class UserManager {

	public void signIn(User user) {
		System.out.println(user.firstName + " " + user.email + " maili ile basarili sekilde kaydoldunuz kaydoldunuz");
	}

	public void emailChange(User user) {
		Scanner email = new Scanner(System.in);
		System.out.println("Yeni Mailinizi giriniz : ");
		user.email = email.nextLine();
		System.out.println("Yeni  mailiniz : " + user.email);
	}

	public void passwordChange(User user) {
		Scanner password = new Scanner(System.in);
		System.out.println("Yeni parolanizi giriniz");
		user.password = password.nextLine();
		for (int i = 0; i < user.password.length(); i++) {
			System.out.print("*");
		}

	}
}
