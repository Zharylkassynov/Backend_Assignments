package artur.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "artur.com")
public class AppConfig {

    @Bean
    public int maxPlayersInTeam(){
        return 5;
    }
}
