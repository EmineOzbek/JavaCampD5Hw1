package javaCampD4Hw3;

import java.time.LocalDate;

import adapters.MernisServiceAdapter;
import business.abstracts.CampaignService;
import business.abstracts.GameService;
import business.abstracts.GamerService;
import business.concretes.CampaignManager;
import business.concretes.GameManager;
import business.concretes.GamerManager;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {

		GameService gameService = new GameManager();
		Game game = new Game(5, "New Game", 69.99);
		gameService.add(game);
		gameService.update(game);
		gameService.delete(game);

		GamerService gamerService = new GamerManager(new MernisServiceAdapter());
		Gamer gamer = new Gamer(1, "Emine", "Özbek", LocalDate.of(1997, 7, 11), "11111111111");
		gamerService.add(gamer);
		gamerService.update(gamer);
		gamerService.delete(gamer);

		CampaignService campaignService = new CampaignManager();
		Campaign campaign = new Campaign(9, "Yeni yýl Kampanyasý", 20);
		campaignService.add(campaign);
		campaignService.update(campaign);
		campaignService.delete(campaign);
	}
}
