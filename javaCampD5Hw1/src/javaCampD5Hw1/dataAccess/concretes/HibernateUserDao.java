package javaCampD5Hw1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import javaCampD5Hw1.dataAccess.abstracts.UserDao;
import javaCampD5Hw1.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean getEmail(String eMail) {
		for(User user:users) {
			if(user.geteMail()== eMail)
				return true;
			}
		return false;
	}

	@Override
	public boolean getPassword(String password) {
		for(User user:users) {
			if(user.getPassword()==password)
				return true;
		}
		return false;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
