import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "Who is the Greatest Player at all times for soccer?";
        String choiceOne = "A. C Ronald";
        String choiceTwo = "B. Messi";
        String choiceThree = "C. Neymar";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        // Write a print statement giving the answer choices
        System.out.println(question);
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);

        // Have the user input an answer
        // Retrieve the user's input
        System.out.println("What is your answer?");
        Scanner input = new Scanner(System.in);
        String UserAnswer = input.next();

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if (UserAnswer.equals(choiceTwo)) {
            System.out.println("Congratulations! You made the right choice!");
        } else {
            System.out.println("Sorry you are wrong, the correct answer is: ");
            System.out.println(choiceTwo);
        }

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
