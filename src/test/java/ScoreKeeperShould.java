import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ScoreKeeperShould {

    @Test
    public void
    should_display_game_score() {
        ScoreKeeper scoreKeeper = new ScoreKeeper(new TeamScore(), new TeamScore());

        assertThat(scoreKeeper.getScore()).isEqualTo("000:000");
    }

    @Test
    public void
    should_display_correct_score_when_adding_points_to_a_team_A() {
        TeamScore teamScoreA = new TeamScore();
        TeamScore teamScoreB = new TeamScore();

        ScoreKeeper scoreKeeper = new ScoreKeeper(teamScoreA, teamScoreB);
        scoreKeeper.scoreTeamA1();
        scoreKeeper.scoreTeamA2();
        scoreKeeper.scoreTeamA3();

        assertThat(teamScoreA.getPoints()).isEqualTo(6);
    }
}
