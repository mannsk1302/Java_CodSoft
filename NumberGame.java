import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    private final int minNumber;
    private final int maxNumber;
    private int secretNum;
    private final int maxAttempts;
    private int attempts;

    public NumberGame(int minNumber, int maxNumber, int maxAttempts) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.maxAttempts = maxAttempts;
        this.attempts = 0;
        generateSecretNum();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int maxAttempts = 5;
        int rounds = 0;
        int totalAttempts = 0;

        do {
            rounds++;
            NumberGame game = new NumberGame(min, max, maxAttempts);
            game.playGame();
            totalAttempts += game.attempts;

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scan.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        } while (true);

        System.out.println("\nYou played " + rounds + " rounds and your average number of attempts per round was " + (double) totalAttempts / rounds);
        scan.close();
    }

    private void generateSecretNum() {
        Random random = new Random();
        secretNum = random.nextInt(maxNumber - minNumber + 1) + minNumber;
    }

    public void playGame() {
        Scanner sc = new Scanner(System.in);

        while (attempts < maxAttempts) {
            System.out.printf("Guess Your Number Between %d to %d (%d attempts left)--> ", minNumber, maxNumber, maxAttempts - attempts);
            int numGuessed = sc.nextInt();
            attempts++;

            if (numGuessed == secretNum) {
                System.out.println("Congratulations!🎉 You Guessed The Correct Number.");
                return;
            } else if (numGuessed < secretNum) {
                System.out.println("Too Low! Try Again.");
            } else {
                System.out.println("Too High! Try Again.");
            }
        }

        System.out.println("Sorry You've Used All Your Attempts. The Correct Number Was " + secretNum);
    }
}