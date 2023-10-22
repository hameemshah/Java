package Basics;
public class If {
    public static void main(String[] args) {

        System.out.println("Your high score is " + calculateScore(true, 800, 5, 100));
        
        System.out.println("Your high score is " + calculateScore(true, 1000, 8, 200));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompeleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompeleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}
