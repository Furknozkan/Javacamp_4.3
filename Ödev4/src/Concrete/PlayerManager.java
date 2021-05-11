package Concrete;


import Abstract.IPlayerCheckService;
import Abstract.IPlayerService;
import Entities.Player;

public class PlayerManager implements IPlayerService{
	private IPlayerCheckService playerCheckService;

	
	public PlayerManager(IPlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}
	
	
	
	@Override
	public void add(Player player) {
		if(IPlayerCheckService.ChechkÝfRealPerson) {
			System.out.println("oyuncu eklendi: "+player.getFirstName() +player.getLastName());
			
		}else
		{System.out.println("oyuncu eklenmedi");}
	
	}

	@Override
	public void delete(Player player) {
		System.out.println("oyuncu silindi "+ player.getFirstName() + player.getLastName());
		
	}

	@Override
	public void update(Player player) {
		System.out.println("oyuncu güncellendi "+player.getFirstName() + player.getLastName());
		
	}

}
