package javaCampD5Hw1.business.concretes;

import javaCampD5Hw1.business.abstracts.EmailService;
import javaCampD5Hw1.business.abstracts.UserService;
import javaCampD5Hw1.business.abstracts.UserValidationService;
import javaCampD5Hw1.dataAccess.abstracts.UserDao;
import javaCampD5Hw1.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private EmailService eMailService;
	private UserValidationService userValidationService;

	public UserManager(UserDao userDao, EmailService eMailService, UserValidationService userValidationService) {
		this.userDao = userDao;
		this.eMailService = eMailService;
		this.userValidationService = userValidationService;

	}

	@Override
	public void logIn(User user) {

		eMailService.verifyEmail(user.geteMail());  //do�rulama linkine t�kland�.

		if (userDao.getEmail(user.geteMail()) && userDao.getPassword(user.getPassword())
				&& eMailService.isVerificatedEmail(user.geteMail()) == true) {
			System.out.println("Giri� ba�ar�l�.");

		} else if (eMailService.isVerificatedEmail(user.geteMail()) == false) {
			System.out.println("E-mail adresinize g�nderilen linke t�klayarak adresinizi do�rulay�n.");
		} else {
			System.out.println("Giri� ba�ar�s�z! Bilgilerinizi kontrol ediniz.");
		}

	}

	@Override
	public void signUp(User user) {
		if (userValidationService.validate(user) == true) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " Kayd�n�z al�nd�");
			eMailService.sendEmail(user, user.geteMail());
			userDao.add(user);
		}

	}

}
