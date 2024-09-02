import java.util.*;
public class sumoffirstn
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter  n : ");
        int n = x.nextInt();

        int sum = 0;
        int i = 1;
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("Sum is : "+ sum);
    }
}