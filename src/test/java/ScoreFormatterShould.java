import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ScoreFormatterShould {

    @Test
    public void
    format_the_game_score() {

        assertThat(ScoreFormatter.format(0,0)).isEqualTo("000:000");
    }
}
