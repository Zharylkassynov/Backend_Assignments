package artur.com.repository;

import artur.com.models.Player;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PlayerRepositoryImpl implements PlayerRepository{
    private final Map<Integer, Player> players = new HashMap<>();

    public PlayerRepositoryImpl() {
        players.put(1, new Player(1, "s1mple", 98, true));
        players.put(2, new Player(2, "ZywOo", 96, true));
        players.put(3, new Player(3, "Niko", 95, true));
        players.put(4, new Player(4, "shiro", 97, true));
        players.put(5, new Player(5, "electroNic", 87, false));
        players.put(6, new Player(6, "ropz", 82, true));
        players.put(7, new Player(7, "Ax1le", 93, false));
        players.put(8, new Player(8, "broky", 88, true));
        players.put(9, new Player(9, "m0NESY", 89, false));
        players.put(10, new Player(10, "Twistzz", 85, true));
        players.put(11, new Player(11, "b1t", 90, false));
        players.put(12, new Player(12, "YEKINDAR", 86, true));
        players.put(13, new Player(13, "HObbit", 88, false));
        players.put(14, new Player(14, "Jame", 90, true));
        players.put(15, new Player(15, "karrigan", 96, false));
    }

    @Override
    public Map<Integer, Player> getAllPlayers() {
        return players;
    }

    @Override
    public void addPlayer(Player player) {
        players.put(player.getId(), player);
    }

    @Override
    public Player getPlayerById(int id) {
        return players.get(id);
    }

}
