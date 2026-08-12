package Array;
import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {

        String[] questions = {
                "What is the main function of a router?",
                "Which part of the computer is considered the brain",
                "What year was Facebook launched?",
                "Who is known as the factor of computers?",
                "What was the first programming language?"

        };

        String[][] options = {
                {"1. Storing files","2.Encypting data" ,"3. Dircting Internet traffic","4. Managing passwords"},
                {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles"},
                {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}
        };

        int[] answers = {3, 1, 2, 4,4};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);
        System.out.println("********************************");
        System.out.println("Welcome to the java Quiz Game");
        System.out.println("********************************");

        for(int i = 0;i < questions.length; i++){
            System.out.println(questions[i]);
            for(String option: options[i]){
                System.out.println(option);
            }
            System.out.println("Type your option: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("Correct Guess ");
                score++;


            }
            else{
                System.out.println("Incorrect Guess");
            }

        }
        System.out.println("********************************");
        System.out.printf("Game Ended Your final score is %d\n",score);
        System.out.println("********************************");

        scanner.close();
    }
}

