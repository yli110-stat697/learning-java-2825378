import java.util.Scanner;

public class FortureTeller {
    public static void main(String[] args) {
        System.out.println("Enter a number between 1 and 10 below:");
        Scanner input = new Scanner(System.in);
        int inputNum = input.nextInt();
        if (inputNum < 1 || inputNum > 10) {
            System.out.println("Not an valid input, rerun the program!");
        } else if (inputNum < 5) {
            System.out.println("Enjoy the luck a friend brings you");
        } else {
            System.out.println("Your shoe selection will make you very happy!");
        }
    }
}
