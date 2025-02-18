import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Random gen = new Random();
        Scanner in = new Scanner(System.in);
        int die1 = 0;
        int die2 = 1;
        int rollSum = die1 + die2;
        int rollNum = 0;
        int point = 0;
        String continueYN = "";
        boolean done = false;

        System.out.println("Welcome to Craps! Let's start the game.");
        do
        {
            rollNum ++;
            die1 = gen.nextInt(6) + 1;
            die2 = gen.nextInt(6) + 1;
            rollSum = die1 + die2;
            if(rollSum == 2 || rollSum == 3 || rollSum == 12)
            {
                System.out.println("You crapped out! You rolled a " + rollSum + ".");
            }
            else if(rollSum == 7 || rollSum == 11)
            {
                    System.out.println("Congrats! You won with a natural. You rolled a " + rollSum + ".");
            }
            else
            {
                System.out.println("You rolled a " + rollSum + ". You are now trying for point.");
                done = false;
                point = rollSum;
                while(!done)
                {
                    die1 = gen.nextInt(6) + 1;
                    die2 = gen.nextInt(6) + 1;
                    rollSum = die1 + die2;
                    if(rollSum == 7)
                    {
                        System.out.println("You crapped out! You rolled a 7.");
                        done = true;
                    }
                    else if(rollSum == point)
                    {
                        System.out.println("Congratulations! You matched your roll of " + point + " and you win!");
                        done = true;
                    }
                    else
                    {
                        System.out.println("You rolled a " + rollSum + ". The point you are trying to match is " + point + ". Better luck next roll!");

                    }

                }

            }

            System.out.print("Would you like to play again? [Y/N]: ");
            continueYN = in.nextLine();
        }while(continueYN.equalsIgnoreCase("Y"));
    }
}