import java.util.*;
public class String_compare {
    public static void main(String[] args) {
        String s1 = "LB";
        String s2 = "LB";
        String s3 = new String ("LB");

        if(s1==s2)
        {
            System.out.println("Strings are equal");   //first o/p
        }
        else
        {
            System.out.println("Strings are not equal");
        }
        if(s2==s3)
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");  //second o/p
        }
        if(s1.equals(s3))
        {
            System.out.println("Strings are equal");     //third o/p
        }
        else
        {
            System.out.println("Strings are not equal");  

        }
        }
}
