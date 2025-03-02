package artur.com.service;

import artur.com.models.Player;
import artur.com.repository.PlayerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Qualifier("contractBased")
public class ContractBasedTeamService implements TeamService {

    @Autowired
    private PlayerRepositoryImpl playerRepository;

    @Autowired
    private int maxPlayersInTeam;

    @Override
    public void selectPlayers() {
        List<Player> contractPlayers = playerRepository.getAllPlayers().values().stream()
                .filter(Player::isHasContract)
                .limit(maxPlayersInTeam)
                .collect(Collectors.toList());

        System.out.println("Team selected based on contract: ");
        contractPlayers.forEach(player -> System.out.println(player.getName()));
    }
}
