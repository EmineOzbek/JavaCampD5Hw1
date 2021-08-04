package javaCampD5Hw1;

import javaCampD5Hw1.business.abstracts.UserService;
import javaCampD5Hw1.business.concretes.EmailManager;
import javaCampD5Hw1.business.concretes.UserManager;
import javaCampD5Hw1.business.concretes.UserValidationManager;
import javaCampD5Hw1.core.GLoginManagerAdapter;
import javaCampD5Hw1.core.GLoginService;
import javaCampD5Hw1.dataAccess.concretes.HibernateUserDao;
import javaCampD5Hw1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new HibernateUserDao(), new EmailManager(), new UserValidationManager());
		GLoginService gLoginService = new GLoginManagerAdapter();
		
		User user1 = new User(1, "Emine", "Özbek", "emine@gmail.com", "123456");
		User user2 =new User(2,"Faruk","Sevgi", "faruk@gmail.com","456789");
		User user3 = new User(3, "Fulya", "Kýrýk", "fulya@gmail.com", "456123");

		
		userService.signUp(user1);
		userService.signUp(user2);
		gLoginService.signUp(user3);
		userService.logIn(user1);
		
	}

}
