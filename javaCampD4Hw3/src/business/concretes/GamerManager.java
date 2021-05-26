package business.concretes;

import business.abstracts.GamerCheckService;
import business.abstracts.GamerService;
import entities.concretes.Gamer;

public class GamerManager implements GamerService {

	private GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getId() + "-" + gamer.getFirstName() + " " + gamer.getLastName() + " eklendi.");
		} else {
			System.out.println("Üye bilgileri hatalý!");
		}
	}

	@Override
	public void update(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out
					.println(gamer.getId() + "-" + gamer.getFirstName() + " " + gamer.getLastName() + " güncellendi.");
		} else {
			System.out.println("Üye bilgileri hatalý!");
		}

	}

	@Override
	public void delete(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getId() + "-" + gamer.getFirstName() + " " + gamer.getLastName() + " silindi.");
		} else {
			System.out.println("Üye bilgileri hatalý!");
		}

	}

}
