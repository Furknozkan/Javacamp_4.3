package Adapters;

import Abstract.IPlayerCheckService;
import Entities.Player;

public class MernisPlayerCheckManager implements IPlayerCheckService{

	@Override
	public boolean Chechk›fRealPerson(Player player) {
		
		return true;
	}

}
