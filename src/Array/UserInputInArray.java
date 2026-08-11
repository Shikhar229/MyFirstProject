package Array;
import java.util.Scanner;

public class UserInputInArray {
    public static void main(String[] args){

//        for array of given length
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("What # of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();


        String[] foods = new String[size];
//        empty array of size 3
        for(int i = 0;i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();

        }
        for(int i = 0;i < foods.length; i++){
            System.out.println(foods[i]);
        }


        scanner.close();


    }
}
