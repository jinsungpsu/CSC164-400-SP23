import java.util.Random;

public class SportsScorekeeper {
    public static void main(String[] args) {

        final int NUM_GAMES = 10;
        final int NUM_PERIODS = 2;
        final int HIGH_SCORE_PER_PERIOD = 5;
        final int LOW_SCORE_PER_PERIOD = 0;

        int[][] teamScores = new int[NUM_GAMES][NUM_PERIODS];

        Random rng = new Random();
        rng.setSeed(0);

        for (int i = 0; i < NUM_GAMES; i++) {
            for (int j = 0; j < NUM_PERIODS; j++) {
                teamScores[i][j] = rng.nextInt(LOW_SCORE_PER_PERIOD, HIGH_SCORE_PER_PERIOD+1);
            }
        }




        /*int[] game1 = {1,2};
        int[] game2 = {1,3};
        int[] game3 = {4,0};
        int[] game4 = {0,2};
        int[][] teamScores = {game1, game2, game3,game4};*/

        // display scores for every game
        for (int i = 0; i < NUM_GAMES; i++) {
            System.out.println("\nThis team, in game # " + (i + 1));
            for (int j = 0; j < NUM_PERIODS; j++) {
                System.out.println("In period # " + (j+1) + " this team scored: " + teamScores[i][j]);
            }
        }

        /*int[][] teamScores = {
                {1,2},
                {1,3},
                {4,0},
                {0,2}
        };*/
        // display score for game3 second half
        //System.out.println(game3[1]);
        // System.out.println(teamScores[2][1]);

        // display score for game 1, half 1
        // System.out.println(teamScores[0][0]);

        // display for game 2, half 2
        // System.out.println(teamScores[1][1]);

    }

}
