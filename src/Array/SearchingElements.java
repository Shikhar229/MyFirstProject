package Array;
import java.util.Scanner;
import java.util.Random;

public class SearchingElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 9, 8, 3, 5, 4};
        Scanner scanner = new Scanner(System.in);
        System.out.print("What Element you want to search in the array: ");
        int target = scanner.nextInt();

        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }

        }
        if (!isFound) {
            System.out.println("Elements not found in the array");
        }


    }
}