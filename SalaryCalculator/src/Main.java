import java.util.Scanner;

public class Main {
    public static double AnnualSalary(int numberOfHours, double moneyPerHour, int vacationDay){
        // handle the negative values added in hours
        if(numberOfHours < 0){
            return -1;
        }
        // handle negative values added in money per hour
        if(moneyPerHour < 0){
            return -1;
        }

        double weekPayment = numberOfHours * moneyPerHour;
        int vacationHours = vacationDay * 8;
        double vacationDiscount = vacationHours * moneyPerHour;
        double annualPayment = (weekPayment * 52) - vacationDiscount;

        return annualPayment;
    }
    public static void main(String[] args){

        double annualPayment = AnnualSalary(40,15,8);

        if (annualPayment == -1.0){
            System.out.println("The value inputted was negative. Try again with a valid value");
        } else {
            System.out.println("The annual gross payment is : " + annualPayment);
        }


    }
}
