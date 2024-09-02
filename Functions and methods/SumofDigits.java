import java.util.*;
public class SumofDigits
{
    public static void main(String[] args) {
        Scanner WTF = new Scanner (System.in);
        System.out.print("Enter an integer : ");
        int digits = WTF.nextInt();
        System.out.print("The sum is "+sumofDigits(digits));
    }
    public static int sumofDigits(int n)
    {
        int sumofdigits = 0;
        while(n>0)
        {
            int lastdigit = n%10;
            sumofdigits+=lastdigit;
            n/=10;
        }
        return sumofdigits;
    }
}