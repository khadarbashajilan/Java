import java.util.*;
public class exceptmultipleof10
{
    public static void main(String args[])
    {
        Scanner z = new Scanner (System.in);
        do{
            System.out.println("Enter your number : ");
            int n = z.nextInt();
            if(n % 10 == 0)
            {
                continue;
            }
            System.out.println("Number was : "+n);
        }
        while(true);
    }
}