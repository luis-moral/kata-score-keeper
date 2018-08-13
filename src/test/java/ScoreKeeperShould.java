import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ScoreKeeperShould {

    @Test
    public void
    should_display_game_score() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();

        assertThat(scoreKeeper.getScore()).isEqualTo("000:000");
    }

    @Test
    public void
    should_display_correct_score_when_adding_points_to_a_team_A() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();

        scoreKeeper.scoreTeamA1();
        scoreKeeper.scoreTeamA2();
        scoreKeeper.scoreTeamA3();

        assertThat(scoreKeeper.getScore()).isEqualTo("006:000");
    }
}
