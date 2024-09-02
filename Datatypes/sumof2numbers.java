import java.util.*;

public class sumof2numbers {
    public static void main(String args[]) {
        Scanner abc = new Scanner(System.in);

        System.out.print("Enter the value of num1: ");
        int num1 = abc.nextInt();

        System.out.print("Enter the value of num2: ");
        int num2 =abc.nextInt();

        int sum = num1 + num2;
        System.out.print("The  sum is: "+ sum);
    }

}
