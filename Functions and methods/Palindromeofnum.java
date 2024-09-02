import java.util.*;
public class Palindromeofnum
{
    public static boolean Ispalindrome(int num)
    {
        int palindrome = num;
        int reverse = 0;

        while(palindrome != 0)
        {
            int rem = palindrome % 10;
            reverse = reverse*10+rem;
            palindrome = palindrome/10;
        }
        if(num == reverse)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        System.out.print("Enter a number : ");
        Scanner A = new Scanner(System.in);
        int palindrome = A.nextInt();
        
        if(Ispalindrome(palindrome))
        {
            System.out.println("Number : "+palindrome+" is a palindrome"); 
        }
        else
        {
            System.out.println("Number : "+palindrome+" is not a palindrome");        

        }
    }
}