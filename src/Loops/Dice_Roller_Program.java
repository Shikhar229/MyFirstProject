package Loops;
import java.util.Random;

import java.util.Scanner;

public class Dice_Roller_Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        System.out.println("Enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();
        if(numOfDice>0){

            for(int i  = 0; i < numOfDice; i++){
                int roll = random.nextInt(1,7);
                System.out.println("You rolled: "+ roll);
                total += roll;


            }
            System.out.println("Total: "+ total);

        }
        else{
            System.out.println("# of dice must be greater than 0");
        }
//        Roll of the dice
//        Get the total
//        display ascii of dice





    }



}
