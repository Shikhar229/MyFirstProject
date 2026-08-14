package Oops;
import java.util.Scanner;
import java.util.Random;

class tom{
    String make  = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You start the engine");

    }
    void stop(){
        isRunning = false;
        System.out.println("You stopped the engine");
    }
    void drive(){
        System.out.println("You drive the "+ model);
    }
    void brake(){
        System.out.println("You brake the "+model);
    }






}
public class Car {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random rando  = new Random();

        tom tom = new tom();


//        System.out.println(tom.model);
//        System.out.println(tom.year);
//        System.out.println(tom.year);
//        System.out.println(tom.price);
//        System.out.println(tom.isRunning);
//        System.out.println(tom.isRunning);
//        tom.start();
//        System.out.println(tom.isRunning);
//        tom.stop();
//        System.out.println(tom.isRunning);

    }

}
