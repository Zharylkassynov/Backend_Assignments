package artur.com.singleton;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MatchAnalyzer {
    public MatchAnalyzer() {
        System.out.println("MatchAnalyzer initialized (lazy)");
    }

    public void analyzeLastMatch() {
        System.out.println("Analyzing last 5 matches...");
    }
}
