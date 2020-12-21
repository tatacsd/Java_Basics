import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
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




        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendence);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);

         */

        /*
        System.out.println("Pick a number between 1 and 10: ");
        Scanner scanner = new Scanner(System.in);

        int inputtedNumber = scanner.nextInt();
        if(inputtedNumber < 5) {
            System.out.println("Enjoy the good luck a friend brings to you");
        } else {
            System.out.println("Your shoe selection will make you happy today");
        }
         */
        
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        while(isOnRepeat){
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song off of repeat? If so, answer yes");
            String userInput = input.next();

            if(userInput.equals("yes")){
                isOnRepeat = false;
            }
        }

        System.out.println("Playing next song");


    }
}
