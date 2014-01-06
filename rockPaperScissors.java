/**
 *date made: 3/28/11
 * lindsay hoyt
 * @author lab02020
 */
import java.util.Scanner;
import java.util.Random;

public class rockPaperScissors
{
    public static void main(String[] args)
    {
        int input;
        int number;
        int choice;
        int human = 0;
        int computer = 0;
        char letter;
        
        Scanner keyboard = new Scanner (System.in);

        System.out.println("Rock, Paper, Scissors Game!");
        System.out.println("Do you want to play? (y/n)");
        String answer = keyboard.nextLine();
        
        while (answer.charAt(0) == 'y')     //loops the game till they enter n for no
        {
            human = getUserInput();
            System.out.println("You picked:" + human);

            computer = getRandomNumber();
            System.out.println("The computer's number was: " + computer);

            char winner = whoWins(human, computer);

            if (winner == 'C')
            {
                System.out.println("The winner is the computer.");
            }

            else if (winner == 'H')
            {
                 System.out.println("The winner is you.");
            }

            else if (winner == 'T')
            {
                System.out.println("There is no winner its a tie.");
            }

            System.out.println("Do you want to keep playing (Y/N)?:  ");
            answer = keyboard.nextLine();
        }
    }

    public static int getUserInput()    //asks the player for a number
    {
        int input;
        
        Scanner keyboard = new Scanner (System.in);

        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.println("Please enter your number:  ");
	input = keyboard.nextInt();

        return input;
    }

    public static int getRandomNumber() //produces a random number from 0-4
    {
        int number;

        Random randomNumbers = new Random();

        number = randomNumbers.nextInt(4);

        return number;
    }

    public static char whoWins(int human, int computer) // calculates the answers
    {
        final int ROCK = 1;
        final int PAPER = 2;
        final int SCISSORS = 3;

        if((human == ROCK) && (computer == SCISSORS))
           return 'H';     //human wins

        else if((human == SCISSORS) && (computer == ROCK))
           return 'C';     //computer wins

        else if((human == PAPER) && (computer == ROCK))
           return 'H';     //human wins

        else if((human == ROCK) && (computer == PAPER))
           return 'C';     //computer wins
 
        else if((human == SCISSORS) && (computer == PAPER))
            return 'H';     //human wins

        else if((human == PAPER) && (computer == SCISSORS))
            return 'C';     //computer wins

        else
            return 'T';     //tie
    }
}







/*do
	{
             //call the printMenu method
             value = getUserInput();
             choice = keyboard.nextInt();

		switch (choice)
		{
                    case 1:
                        System.out.println("You have choosen Rock.");
			computer = getRandomNumber();

			System.out.println("Player 2 has choosen: " + computer);
			break;

                     case 2:
                        System.out.println("You have choosen Paper.");
			computer = getRandomNumber();

			System.out.println("Player 2 has choosen: " + computer);
			break;

                     case 3:
                        System.out.println("You have choosen Scissors.");
			computer = getRandomNumber();

			System.out.println("Player 2 has choosen: " + computer);
			break;

                }
        }*/