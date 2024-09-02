import java.util.*;
public class productof2numbers
{
    public static void main (String args[]){
        Scanner abc = new Scanner (System.in);
        Scanner xyz = new Scanner(System.in);


        System.out.print("Enter the value of num1 : ");
        int num1 = abc.nextInt();


        System.out.print("Enter the value of num2 : ");
        int num2 = xyz.nextInt();

        System.out.print("The product is : ");
        int product = num1 * num2;
        System.out.print(product);
    }
}