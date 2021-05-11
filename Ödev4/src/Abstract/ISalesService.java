package Abstract;

import Entities.Game;
import Entities.Player;

public interface ISalesService {
	void sale(Player player, Game game);
	void campaignSales(Player player, Game game);

}
