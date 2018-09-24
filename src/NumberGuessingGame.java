import java.util.Scanner;

public class NumberGuessingGame {

    public static void main (String[]args){

        Scanner keyboard;
        int pickedNumber;
        int guessedNumber;
        boolean gotItRight;

        pickedNumber = (int)(Math.random()*100);
        keyboard = new Scanner(System.in);
        gotItRight = false;

        //System.out.println(pickedNumber);
        System.out.println("Please, give me a number.");



       
        guessedNumber = keyboard.nextInt();

        while(!gotItRight){


            if (guessedNumber < pickedNumber){
                System.out.println("Your number is too low.");

            } else if (guessedNumber > pickedNumber){
                System.out.println("Your number is too high.");

            } else if (guessedNumber == pickedNumber){
                System.out.println("You guessed correct! Congratulations!");

                gotItRight = true;
                break;
            }

            System.out.println("Please, guess again.");
            guessedNumber = keyboard.nextInt() ;
        }


    }
}
