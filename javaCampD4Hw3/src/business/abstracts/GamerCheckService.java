package business.abstracts;

import entities.concretes.Gamer;

public interface GamerCheckService {

	boolean checkIfRealPerson(Gamer gamer);
}
