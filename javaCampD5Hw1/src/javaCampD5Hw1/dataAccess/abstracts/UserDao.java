package javaCampD5Hw1.dataAccess.abstracts;

import java.util.List;

import javaCampD5Hw1.entities.concretes.User;

public interface UserDao {

	void add(User user);
	void update(User user);
	void delete(User user);
	boolean getEmail(String eMail);
	boolean getPassword(String password);
	List<User> getAll();
	
}
