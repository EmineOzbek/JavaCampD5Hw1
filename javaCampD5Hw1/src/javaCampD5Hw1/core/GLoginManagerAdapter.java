package javaCampD5Hw1.core;

import javaCampD5Hw1.entities.concretes.User;
import javaCampD5Hw1.google.GoogleLoginManager;

public class GLoginManagerAdapter implements GLoginService{

	GoogleLoginManager gooleLoginManager = new GoogleLoginManager();

	@Override
	public void logIn(User user) {
		gooleLoginManager.logIn(user.geteMail(),user.getPassword() );
	}

	@Override
	public void signUp(User user) {
		gooleLoginManager.signUp(user.geteMail(), user.getPassword());
	}
}
