package javaCampD5Hw1.business.abstracts;

import javaCampD5Hw1.entities.concretes.User;

public interface UserValidationService {

	boolean name_passwordValidate(User user);
	boolean eMailValidate(User user);
	boolean validate(User user);
	
}
