package Abstract;

import Entities.Game;
import Entities.Player;

public interface IGameService {

	void add(Game game);
	void delete(Game game);
	void update(Game game);
	void add(Player player);
	void delete(Player player);
	void update(Player player);



}
