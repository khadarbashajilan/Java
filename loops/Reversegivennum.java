import java.util.*;
public class Reversegivennum
{
    public static void main(String args[])
    {
        int n =10283;
        int rev=0;

        while(n>0)
        {
            int Lastdigit=n%10;
            rev = (rev*10)+Lastdigit;
            n=n/10;
        }
        System.out.print(rev);
    }
}