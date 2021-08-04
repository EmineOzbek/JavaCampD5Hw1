package javaCampD5Hw1.business.concretes;

import java.util.ArrayList;
import java.util.List;

import javaCampD5Hw1.business.abstracts.EmailService;
import javaCampD5Hw1.entities.concretes.User;

public class EmailManager implements EmailService {

	List<String> verificatedEmails = new ArrayList<String>();
	
	@Override
	public void sendEmail(User user, String eMail) {
		System.out.println(user.geteMail() + " adresine gönderilen doðrulama linkine týklayýp kaydýnýzý tamamlayýnýz.");
	}
	
	@Override
	public void verifyEmail(String eMail) {
		verificatedEmails.add(eMail);
	}

	@Override
	public boolean isVerificatedEmail(String eMail) {
		
		if(verificatedEmails.contains(eMail)) {
			return true;
		}
		return false;
	}

	
}
