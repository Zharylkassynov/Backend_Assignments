package artur.com;

import artur.com.service.TeamService;
import artur.com.singleton.MatchAnalyzer;
import artur.com.singleton.TournamentManager;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        TeamService teamService = context.getBean(TeamService.class);
        teamService.selectPlayers();

        TeamService contractTeamService = context.getBean("contractBasedTeamService", TeamService.class);
        contractTeamService.selectPlayers();

        TournamentManager tournamentManager = context.getBean(TournamentManager.class);
        tournamentManager.registerTeam();

        MatchAnalyzer matchAnalyzer = context.getBean(MatchAnalyzer.class);
        matchAnalyzer.analyzeLastMatch();
    }
}