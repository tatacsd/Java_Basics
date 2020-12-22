import java.util.Scanner;

public class Main {
    public static double CalculateMealPrice(double listedMealPrice, double tipRate, double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = tip + tax + listedMealPrice;

        return result;
    }
    public static void main(String[] args){

        double groupMealPrice = CalculateMealPrice(15, 0.1, 0.12);
        System.out.println(groupMealPrice);

        double individualMealPrice = groupMealPrice / 5;
        System.out.println(individualMealPrice);

    }
}
