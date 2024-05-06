package bean;
import java.util.*;

public class User {

	private  String login;
	private String password;
    private static List<User> users = new ArrayList<>();

	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	public static void add(User u) {
		users.add(u);
	}
	
	public String getLogin() {
		return login;
	}
	public static boolean exist(User u) {
		for (User user : users) {
			if(u.getLogin().equals(user.getLogin()) && user.password.equals(u.password))
				return true;
		}
		return false;
	}
}
