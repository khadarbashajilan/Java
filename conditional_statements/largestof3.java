import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class largestof3
{
    public static void main(String args[])
    {
        int A=1, B=3, C=6;
        if((A>=B) && (A>=C))
        {
            System.out.print("A is largest");
        }
        else if (B>=C)
        {
            System.out.print("B is largest");
        }
        else
        {
            System.out.print("C is largest");
        }

        }
    }

