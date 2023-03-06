import java.util.Scanner;

public class MultipleChoices {

    public static void main(String args[]) {
        String question = "Who is the Greatest Player at all times for soccer?";
        String choiceOne = "C Ronald";
        String choiceTwo = "Messi";
        String choiceThree = "Neymar";

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

        while (!UserAnswer.equals(correctAnswer)) {
            System.out.println("Sorry you are wrong, try again!");
            System.out.println("What is your answer?");
            UserAnswer = input.next();
        }
        System.out.println("Congratulations!");

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
//        if (correctAnswer.equals(UserAnswer)) {
//            System.out.println("Congratulations! You made the right choice!");
//        } else {
//            System.out.println("Sorry you are wrong, the correct answer is: ");
//            System.out.println(choiceTwo);
//        }

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
