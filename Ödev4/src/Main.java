import Concrete.PlayerManager;


import Entities.Campaign;
import Entities.Game;
import Entities.Player;
import Concrete.PlayerManager;
import Concrete.PlayerCheckManager;
import Concrete.CampaignCheckManager;
import Concrete.GameCheckManager;
import Concrete.GameManager;
import Concrete.SalesManager;
import Abstract.ISalesService;
import Abstract.ICampaignService;
import Abstract.IGameService;
import Abstract.IPlayerCheckService;
import Abstract.IPlayerService;





public class Main {

	public static void main(String[] args) {
		GameManager gameManager = new GameManager();
		PlayerManager playerManager = new PlayerManager(new PlayerCheckManager());
		SalesManager salesManager = new SalesManager();
		
		Game game = new Game();
		game.setId(1);
		game.setName("MyGame");
		game.setPrice("100");
		
		Player player = new Player();
		player.setId(1);
		player.setFirstName("Furkan");
		player.setLastName("÷zkan");
		player.setAge("14");
		player.set›denity›d("000001");
		
		
		
		gameManager.add(game);
		gameManager.delete(game);
		gameManager.update(game);
		
		System.out.println("------------------");
		System.out.println("------------------");
		
		playerManager.add(player);
		playerManager.delete(player);
		playerManager.update(player);
		
		System.out.println("------------------");
		System.out.println("------------------");
		
		
		
		
		

		
		
		
	}

}
