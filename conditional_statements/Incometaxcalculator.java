import java.util.*;

public class Incometaxcalculator {
    public static void main(String args[]) {
        Scanner X = new Scanner(System.in);

        System.out.print("Enter the income : ");
        int income = X.nextInt();
        int tax;

        if (income < 500000) {
            tax = 0;
        } else if (income > 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.print("Your tax is : " + tax);
    }
}