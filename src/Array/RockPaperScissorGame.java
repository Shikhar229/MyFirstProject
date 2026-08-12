package Array;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissorGame {
    public static void main(String[] args){
//        Rock paper Scissor game

//        Declare variables
//        Get choice form the user
//        Get random choice for the computer
//        check win conditions
//        ask to play again
//        goodbye message

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock","paper","scissor"};

        String playerChoice;
        String computerChoice;
        String playAgain = "yes";


        while(playAgain.equals("yes")){
            System.out.print("Enter your move(rock,paper,scissor) ");
            playerChoice = choices[random.nextInt(3)];
            System.out.println(playerChoice);
            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissor")){
                System.out.println("Invalid Choice");
                System.out.println("Try again");
                continue;

            }
            computerChoice = choices[random.nextInt(3)];
//        0 1 2
//        0-> rock
//        1-> paper
//        2-> scissor

            System.out.println("Computer Choice: "+ computerChoice);
            if(computerChoice.equals(playerChoice) ){
                System.out.println("It is a Tie !");
            }
            else if(
                    (computerChoice.equals("rock") && playerChoice.equals("paper")) ||
                            (computerChoice.equals("scissor") && playerChoice.equals("rock")) ||
                            (computerChoice.equals("paper") && playerChoice.equals("scissor"))
            ) {
                System.out.println("You win !");
                System.out.println("Do you want to play Again ?(Yes/NO) ");
                playAgain = scanner.nextLine().toLowerCase();
                if(playAgain.equals("no")){
                    break;
                }
                else if(!playAgain.equals("yes") && !playAgain.equals("no")){
                    System.out.println("Jao bhago yaha se choice to padh leta");
                    break;

                }

            }
            else{
                System.out.println("You lose!");
            }


        }

    }
}
