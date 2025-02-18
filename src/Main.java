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
        String continueYN = "";

        do
        {
            System.out.println("Welcome to Craps! Let's start the game.");
            while(die1 != die2)
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

            }


        }while(continueYN.equalsIgnoreCase("Y"));
    }
}