import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class PractiseprobIsEven
{
    public static void main(String args[])
    {
        Scanner M = new Scanner (System.in);

        System.out.print("Enter an integer : ");
        int num = M.nextInt();

        if(IsEven(num))
        {
            System.out.println("(❁´◡`❁) Number is even");
        }
        else
        {
            System.out.println("╰(*°▽°*)╯ Number is odd");
        }
        }
        public static boolean IsEven(int number)
        {
            if( number % 2 ==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
