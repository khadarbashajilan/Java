import java.util.*;
public class numbersfrom1ton
{
    public static void main(String args[])
    {
        Scanner x = new Scanner (System.in);
        System.out.println("Enter n : ");
        int n= x.nextInt();

        int counter = 1;
        while (counter <= n)
        {
            System.out.println(counter);
            counter++;
        }
    }
}