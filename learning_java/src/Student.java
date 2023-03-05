import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int Age = 15;
        double Gpa = 4.5;
        String first_name = "Rosemary";
        String last_name = "Lee";
        boolean hasPerfectAttendenc = true;
        char first_inital = first_name.charAt(0);
        char last_inital = last_name.charAt(0);

        System.out.println("Age is " + Age + "; GAP is " + Gpa + "; Initials are " + first_inital + last_inital);
        System.out.println("This student has a status of " + hasPerfectAttendenc);

        System.out.println("What is the updated GPA: ");
        Scanner input = new Scanner(System.in);
        Gpa = input.nextDouble();
        System.out.println("New GPA is " + Gpa);
    }
}
