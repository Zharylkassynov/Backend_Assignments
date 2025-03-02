package artur.com.repository;

import artur.com.models.Player;
import java.util.Map;

public interface PlayerRepository {
    Map<Integer, Player> getAllPlayers();
    void addPlayer(Player player);
    Player getPlayerById(int id);
}
