public class ScoreKeeper {

    private int pointsTeamA;
    private int pointsTeamB;

    public ScoreKeeper() {
        pointsTeamA = 0;
        pointsTeamB = 0;
    }

    public void scoreTeamA1() {
        pointsTeamA++;
    }

    public void scoreTeamA2() {
        pointsTeamA += 2;
    }

    public void scoreTeamA3() {
        pointsTeamA += 3;
    }

    public void scoreTeamB1() {

    }

    public void scoreTeamB2() {

    }

    public void scoreTeamB3() {

    }

    public String getScore() {

        return String.format("%03d:%03d",pointsTeamA, pointsTeamB);
    }
}