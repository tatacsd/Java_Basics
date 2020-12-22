import java.util.Scanner;

public class Main {
    public static void CalculateMealPrice(double listedMealPrice, double tipRate, double taxRate){
        double tip = (tipRate/100) * listedMealPrice;
        double tax = (taxRate/100) * listedMealPrice;
        double result = tip + tax + listedMealPrice;

        System.out.println("Your total meal price is: " + result);
    }
    public static void main(String[] args){
        /*
        System.out.println("Type your meal price: ");
        Scanner input = new Scanner(System.in);
        double listedMealPrice = input.nextDouble();
        System.out.println("Type the amount of tips in %: ");
        double tipRate = input.nextDouble();
        System.out.println("Type the tax rate in %: ");
        double taxRate = input.nextDouble();

        CalculateMealPrice(listedMealPrice, tipRate, taxRate);
         */
        CalculateMealPrice(15, 10, 10);



    }
}
