import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ScoreKeeperShould {

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

    @Test
    public void
    should_display_correct_score_when_adding_points_to_a_team_B() {
        TeamScore teamScoreA = new TeamScore();
        TeamScore teamScoreB = new TeamScore();

        ScoreKeeper scoreKeeper = new ScoreKeeper(teamScoreA, teamScoreB);
        scoreKeeper.scoreTeamB1();
        scoreKeeper.scoreTeamB2();
        scoreKeeper.scoreTeamB3();

        assertThat(teamScoreB.getPoints()).isEqualTo(6);
    }

    @Test
    public void
    should_display_game_score() {
        ScoreKeeper scoreKeeper = new ScoreKeeper(new TeamScore(), new TeamScore());
        scoreKeeper.scoreTeamB1();
        scoreKeeper.scoreTeamA3();
        scoreKeeper.scoreTeamB2();
        scoreKeeper.scoreTeamB3();

        assertThat(scoreKeeper.getScore()).isEqualTo("003:006");
    }
}
