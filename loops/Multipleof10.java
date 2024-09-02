import java.util.*;
public class Multipleof10
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);

        do{
            System.out.println("Enter your number : ");
            int n =x.nextInt();

            if(n %10 != 0)
            {
                break;
            }
            System.out.println(n);
        }
        while(true);
    }
}