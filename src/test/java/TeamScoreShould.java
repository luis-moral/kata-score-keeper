import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TeamScoreShould {

    @Test
    public void
    start_at_0_points() {
        TeamScore teamScore = new TeamScore();

        assertThat(teamScore.getPoints()).isEqualTo(0);
    }

    @Test
    public void
    keep_current_points() {
        TeamScore teamScore = new TeamScore();
        teamScore.addPoints(6);

        assertThat(teamScore.getPoints()).isEqualTo(6);
    }
}
