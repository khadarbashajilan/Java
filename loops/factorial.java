import java.util.*;
public class factorial
{
    public static void main(String args[])
    {
        Scanner xyz = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int num = xyz.nextInt();
        int fact=1;
        for(int i=1; i<=num; i++)
        {
            fact*=i;
        }
        System.out.println("Factorial is : "+fact);
    }
}