public class ScoreKeeper {

    public static final int ONE_POINT = 1;
    public static final int TWO_POINTS = 2;
    public static final int THREE_POINTS = 3;

    private final TeamScore teamScoreA;
    private final TeamScore teamScoreB;

    public ScoreKeeper(TeamScore teamScoreA, TeamScore teamScoreB) {
        this.teamScoreA = teamScoreA;
        this.teamScoreB = teamScoreB;
    }

    public void scoreTeamA1() {
        teamScoreA.addPoints(ONE_POINT);
    }

    public void scoreTeamA2() {
        teamScoreA.addPoints(TWO_POINTS);
    }

    public void scoreTeamA3() {
        teamScoreA.addPoints(THREE_POINTS);
    }

    public void scoreTeamB1() {
        teamScoreB.addPoints(ONE_POINT);
    }

    public void scoreTeamB2() {
        teamScoreB.addPoints(TWO_POINTS);
    }

    public void scoreTeamB3() {
        teamScoreB.addPoints(THREE_POINTS);
    }

    public String getScore() {

        return String.format("%03d:%03d", teamScoreA.getPoints(), teamScoreB.getPoints());
    }
}