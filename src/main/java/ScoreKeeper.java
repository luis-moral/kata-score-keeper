public class ScoreKeeper {

    private final TeamScore teamScoreA;
    private final TeamScore teamScoreB;

    public ScoreKeeper(TeamScore teamScoreA, TeamScore teamScoreB) {
        this.teamScoreA = teamScoreA;
        this.teamScoreB = teamScoreB;
    }

    public void scoreTeamA1() {
        teamScoreA.addPoints(1);
    }

    public void scoreTeamA2() {
        teamScoreA.addPoints(2);
    }

    public void scoreTeamA3() {
        teamScoreA.addPoints(3);
    }

    public void scoreTeamB1() {

    }

    public void scoreTeamB2() {

    }

    public void scoreTeamB3() {

    }

    public String getScore() {

        return String.format("%03d:%03d", teamScoreA.getPoints(), teamScoreB.getPoints());
    }
}