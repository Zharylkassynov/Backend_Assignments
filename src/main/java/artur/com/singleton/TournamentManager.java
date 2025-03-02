package artur.com.singleton;

import org.springframework.stereotype.Component;

@Component
public class TournamentManager {
    public TournamentManager() {
        System.out.println("TournamentManager initialized (eager)");
    }

    public void registerTeam() {
        System.out.println("Team registered for the tournament");
    }
}
