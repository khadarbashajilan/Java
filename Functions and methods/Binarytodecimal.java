import java.util.*;
public class Binarytodecimal
{
    public static void binToDec(int binNum)
    {
        int number=binNum;
        int decNum=0;
        int pow=0;

        while(binNum>0)
        {
            int lastDigit = binNum%10;
            decNum = decNum+(lastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.print("Decimal of "+number+" = "+decNum);
    }
    public static void main(String args[])
    {
        System.out.print("Enter the binary number : ");
        Scanner x =new Scanner(System.in);
        int num = x.nextInt();

        binToDec(num);
    }
}