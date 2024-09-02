import java.util.*;
public class ternaryoperatorpassorfail
{
    public static void main( String args[] )
    {
        int marks = 37;
        String reportcard = marks >= 33 ? "PASS" : "FAIL";
        System.out.println(reportcard);

        int marks1 = 19;
        String reportcard1 = marks1 >= 33 ? "PASS" : "FAIL";
        System.out.println(reportcard1);
    }
}