package artur.com.service;

import artur.com.models.Player;
import artur.com.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Primary
public class RatingBasedTeamService implements TeamService {

    @Autowired
    @Qualifier("hashMapPlayerRepository")
    private PlayerRepository playerRepository;

    @Autowired
    private int maxPlayersInTeam;

    @Override
    public void selectPlayers() {
        List<Player> topPlayers = playerRepository.getAllPlayers().values().stream()
                .sorted(Comparator.comparingInt(Player::getRating).reversed())
                .limit(maxPlayersInTeam)
                .toList();

        System.out.println("Team selected based on rating: ");
        topPlayers.forEach(player -> System.out.println(player.getName()));
    }
}
