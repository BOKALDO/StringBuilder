package TestJava;

/**
 * Created by Boka on 2015.11.14..
 */
public class codeBlock {
    public static void main(String[] args) {

        calcScore(true, 800, 5, 100);

        calcScore(true, 10000, 8, 200);

    }

    public static void calcScore(boolean gameO, int score, int lvlComp, int bonus) {

        if (gameO) {
            int finalScore = score + (lvlComp * bonus);
            finalScore += 2033;
            System.out.println("Your final score was " + finalScore);
        }

    }
}
