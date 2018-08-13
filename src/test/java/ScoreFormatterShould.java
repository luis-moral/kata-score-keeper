import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(Parameterized.class)
public class ScoreFormatterShould {

    private int pointsA;
    private int pointsB;
    private String expected;

    @Parameterized.Parameters
    public static Collection parameters() {
        return Arrays.asList(new Object[][] {
                { 0, 0, "000:000" },
                { 1, 1, "001:001" },
                { 9, 6, "009:006" }
        });
    }

    public ScoreFormatterShould(int pointsA, int pointsB, String expected) {
        this.pointsA = pointsA;
        this.pointsB = pointsB;
        this.expected = expected;
    }

    @Test
    public void
    format_the_game_score() {
        assertThat(ScoreFormatter.format(pointsA, pointsB)).isEqualTo(expected);
    }
}
