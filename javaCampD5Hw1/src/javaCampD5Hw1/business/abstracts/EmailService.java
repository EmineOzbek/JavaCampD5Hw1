package javaCampD5Hw1.business.abstracts;

import javaCampD5Hw1.entities.concretes.User;

public interface EmailService {

	public void sendEmail(User user, String eMail);
	public void verifyEmail(String eMail);
	public boolean isVerificatedEmail(String eMail);
	
}
