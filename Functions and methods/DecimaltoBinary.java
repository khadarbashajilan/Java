import java.util.*;
public class DecimaltoBinary
{
    public static void decToBin(int n)
    {
        int num = n;
        int pow = 0;
        int binNum = 0;

        while(n>0)
        {
            int rem = n%2;
            binNum= binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println("Binary form of "+num+" = "+binNum);
    }
    public static void main(String args[])
    {
        System.out.print("Enter the Decimal number : ");
        Scanner y = new Scanner(System.in);
        int n = y.nextInt();
        decToBin(n);

    }
}