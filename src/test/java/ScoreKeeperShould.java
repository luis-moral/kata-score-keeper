import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ScoreKeeperShould {

    @Test
    public void
    should_display_game_score() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();

        assertThat(scoreKeeper.getScore()).isEqualTo("000:000");
    }
}
