import java.util.*;
public class oddsumandevensum
{
    public static void main(String args[])
    {
        Scanner x = new Scanner (System.in);
        int num;
        int choice;
        int evensum=0, oddsum=0;

    
    do 
    {
        System.out.println("Eneter the number : ");
        num = x.nextInt();
        if(num % 2 == 0)
        {
            evensum+=num;
        }
        else
        {
            oddsum+=num;
        }
        System.out.println("Do you want to continue ? Press 1 for yes and 0 for no");
        choice = x.nextInt();
        }
        while(choice == 1);
        {
            System.out.println("Summ of evennumbers : "+ evensum);
            System.out.println("Sum of oddnumbers : "+ oddsum);
        }
    }
}
    
