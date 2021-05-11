package Concrete;

import Abstract.ISalesService;

import Entities.Game;
import Entities.Player;

public class SalesManager implements ISalesService{

	@Override
	public  void sale(Player player, Game game) {
		System.out.println("Sat�� tamamland�");
		
	}

	@Override
	public void campaignSales(Player player, Game game) {
		System.out.println("Kampanya sat��� tamamland�");
		
	}

}
