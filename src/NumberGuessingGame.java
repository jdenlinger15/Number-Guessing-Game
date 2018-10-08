import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner keyboard;
        int pickedNumber;
        int guessedNumber;

        String again;


        keyboard = new Scanner(System.in);


        do {
            pickedNumber = (int) (Math.random() * 100);
            // System.out.println(pickedNumber);
            System.out.println("Please guess a number.");
            guessedNumber = keyboard.nextInt();
            again = "";

            while (guessedNumber != pickedNumber) {
                if (guessedNumber < pickedNumber) {
                    System.out.println("Your number is too low.");

                } else {
                    System.out.println("Your number is too high");

                }
                System.out.println("Guess again please.");
                guessedNumber = keyboard.nextInt();
            }
            if (guessedNumber == pickedNumber) {
                System.out.println("You guessed correct! Congrats!");
            }

            System.out.println("Would you like to play again? (yes or no).");
            again = keyboard.next().toLowerCase();

            }while (again.equals("yes"));
             System.out.println("Ok then, Adios!");}}


