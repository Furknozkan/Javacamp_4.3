package Concrete;

import Abstract.IGameService;
import Entities.Game;
import Entities.Player;

public class GameManager implements IGameService{

	


	@Override
	public void add(Game game) {
		System.out.println("oyun eklendi");
		
	}


	@Override
	public void delete(Game game) {
		System.out.println("oyun silindi");
		
	}


	@Override
	public void update(Game game) {
		System.out.println("oyun güncellendi");
		
	}


	@Override
	public void add(Player player) {
		System.out.println("oyun eklendi");
		
	}


	@Override
	public void delete(Player player) {
		System.out.println("oyun silindi");
		
	}


	@Override
	public void update(Player player) {
		System.out.println("oyun güncellendi");
		
	}

}
