import java.util.*;
public class reverseofnum
{
    public static void main(String args[])
    {
        Scanner x = new Scanner (System.in);

        System.out.println("Enter n : ");
        int n = x.nextInt();


        while(n>0)
        {
            int Lastdigit = n%10;
            System.out.print(Lastdigit);
            n=n/10;
        }
    }
}