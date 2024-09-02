import java.util.*;
public class primeornot
{
    public static void main(String args[])
    {
        Scanner z = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n = z.nextInt();

        if(n==2)
        {
            System.out.println("It is a prime number");
        }
        else
        {
            boolean isPrime = true;
            for(int i = 2; i<=Math.sqrt(n); i++)
            {
                if(n % i == 0)
                {
                    isPrime = false;
                }
            }
            if(isPrime == true)
            {
                System.out.println("It is a prime number");
            }
            else
            {
                System.out.println("It is not a prime number");
            }
        }
    }
}