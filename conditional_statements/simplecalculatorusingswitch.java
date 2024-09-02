import java.util.*;
public class simplecalculatorusingswitch
{
    public static void main(String args[])
    {
        Scanner z = new Scanner(System.in);

        System.out.println("Enter A : ");
        int A = z.nextInt();

        System.out.println("Enter B : ");
        int B = z.nextInt();

        System.out.println("Enter the operator to perform (+,-,*,/,%) : ");
        char operator = z.next().charAt(0);

        switch(operator)
        {
            case '+' : System.out.println(A+B);
            break;

            case '-' : System.out.println(A-B);
            break;

            case '*' : System.out.println(A*B);
            break;

            case '/' : System.out.println((float)A/B);
            break;

            case '%' : System.out.println((float)A%B);
            break;

            default : System.out.println("Wrong opeartor");
        }

    }
}