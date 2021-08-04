package javaCampD5Hw1.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javaCampD5Hw1.business.abstracts.UserValidationService;
import javaCampD5Hw1.entities.concretes.User;

public class UserValidationManager implements UserValidationService {

	List<String> listOfEmail = new ArrayList<String>();

	@Override
	public boolean validate(User user) {
		if (name_passwordValidate(user) && eMailValidate(user) == true) {
			return true;
		}
		return false;
	}

	@Override
	public boolean name_passwordValidate(User user) {
		if (user.getFirstName().length() >= 2 && user.getLastName().length() >= 2 && user.getPassword().length() >= 6) {

		} else {
			System.out.println(" �sim ve soyisim en az 2 karakterden olu�mal�d�r." + "\n �ifre en az 6 karakterden olu�mal�d�r.");
			return false;
		}
		return true;
	}

	@Override
	public boolean eMailValidate(User user) {
		final Pattern regexPattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
				Pattern.CASE_INSENSITIVE);
		Matcher matcher = regexPattern.matcher(user.geteMail());
		if (matcher.find()) {

		} else {
			System.out.println("Email adresi ge�ersiz.");
			return false;
		}

		boolean result = true;
		if (listOfEmail.contains(user.geteMail())) {
			System.out.println("L�tfen ba�ka bir e-mail adresi girin. Bu e-mail adresi kullan�l�yor.");
			return false;
		} else {
			result = true;
			listOfEmail.add(user.geteMail());	
		}
		return result;
	}

}
