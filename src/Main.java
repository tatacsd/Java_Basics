import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World from the Intelij IDE");
        int studentAge = 28;
        double studentGPA = 3.45;
        String studentFirstName = "Thays";
        String studentLastName = "Casado";
        //char studentFirstInitial = 'T';
        char studentFirstInitial = studentFirstName.charAt(0);
        //char studentLastInitial = 'C';
        char studentLastInitial = studentLastName.charAt(0);
        boolean hasPerfectAttendence = true;

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);



        /*
        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendence);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);

         */
    }
}
