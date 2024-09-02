import java.util.*;
public class functcalcsum{
public static int calculatesum(int num1, int num2)
{
    int sum = num1 + num2;
    return sum;
}
public static void main(String args[])
{
    Scanner x = new Scanner (System.in);
    int a = x.nextInt();
    int b = x.nextInt();
    int sum = calculatesum(a, b);
    System.out.println("The sum is "+sum);
}
}