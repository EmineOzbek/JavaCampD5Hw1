package javaCampD3Hw2;

public class UserManager {

	public void add(User user) {
		System.out.println("Eklendi: " + user.getFirstName());
	}

	public void delete(User user) {
		System.out.println("Silindi: " + user.getFirstName());
	}

}
