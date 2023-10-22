package Basics;
public class Score {
    public static void main(String[] args) {

        displayHighScorePosition("bob", calculateHighScorePosition(999));

    }

    public static void displayHighScorePosition(String name, byte position) {

        System.out.println(name.toUpperCase() + " managed to get into position "
                                         + position + " on the high score list.");
    }

    public static byte calculateHighScorePosition(int score) {
        byte grade = 4;
        if (score >= 1000) {
            grade = 1;
        } else if (score >= 500) {
            grade = 2;
        } else if (score >= 100) {
            grade = 3;
        }
        return grade;
    }
}
