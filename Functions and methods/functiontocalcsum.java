import java.util.*;
public class functiontocalcsum{
public static int calculatesum(int num1, int num2)
{
    int sum = num1 + num2;
    return sum;
}
public static void main(String args[])
{
    
    int a =10;
    int b = 20;
    int sum =calculatesum(a, b);
    System.out.println("The sum is "+sum);
}
}