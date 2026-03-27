import java.util.Scanner;

public class Lab8
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Player 1: Choose rock, scissors, or paper: ");
        String player1 = scan.next().toLowerCase();
        System.out.print("Player 2: Choose rock, scissors, or paper: ");
        String player2 = scan.next().toLowerCase();

        if (player1 == "scissors" && player2 == "paper") {
            System.out.println("Player 1 wins!");
        }

        if (player2 == "scissors" && player1 == "paper") {
            System.out.println("Player 2 wins!");
        }

        if (player1 == "scissors" && player2 == "scissors") {
            System.out.println("It's a tie!");
        }

        if (player1 == "scissors" && player2 == "rock") {
            System.out.println("Player 2 wins!");
        }
        
        if (player2 == "scissors" && player1 == "rock") {
            System.out.println("Player 1 wins!");
        }
        
        if (player1 == "rock" && player2 == "rock") {
            System.out.println("It's a tie!");
        }
        
        if (player1 == "paper" && player2 == "rock") {
            System.out.println("Player 1 wins!");
        }
        
        if (player2 == "paper" && player1 == "rock") {
            System.out.println("Player 2 wins!");
        }
        
        if (player1 == "paper" && player2 == "paper") {
            System.out.println("It's a tie!");
        }
        //(your code goes here…)
    }
}