import java.util.*;
public class MultiplicationTable
{
    public static void printMultiplicationTable(int number)
    {
        Scanner z = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n = z.nextInt();
        for(int i=1; i<= 10; i++)
        {
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
    public static void main(String s[])
    {
        printMultiplicationTable(10);
    }

}