import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;
        System.out.println("LEVEL 1 (EASY - 10 ATTEMPTS)");
        System.out.println("LEVEL 2 (MEDIUM - 5 ATTEMPTS)");
        System.out.println("LEVEL 3 (HARD - 3 ATTEMPTS)");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        if(num == 1){
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guess(es) left. Guess a number: ");
            int guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else if (guess > randomNumber) {
                System.out.println("Your guess is too high.");
            } else {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("Congratulations, you won!");
        } else {
            System.out.println("Sorry, you lost. The number was " + randomNumber);
        }
    }
    else if(num == 2){
       
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        for (int i = 5; i > 0; i--) {
            System.out.println("You have " + i + " guess(es) left. Guess a number: ");
            int guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else if (guess > randomNumber) {
                System.out.println("Your guess is too high.");
            } else {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("Congratulations, you won!");
        } else {
            System.out.println("Sorry, you lost. The number was " + randomNumber);
        }
    }
    else if(num == 3){
        
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        for (int i = 3; i > 0; i--) {
            System.out.println("You have " + i + " guess(es) left. Guess a number: ");
            int guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else if (guess > randomNumber) {
                System.out.println("Your guess is too high.");
            } else {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("Congratulations, you won!");
        } else {
            System.out.println("Sorry, you lost. The number was " + randomNumber);
        
    }
    }
    else
    System.out.println("You only have THREE Levels. Choose 1, 2 or 3 !!!");
    
    }
}