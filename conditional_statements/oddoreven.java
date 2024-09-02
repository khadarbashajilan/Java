import java.util.*;
public class oddoreven{
    public static void main(String args[]){
        Scanner X = new Scanner (System.in);

        System.out.print("Enter the number : ");
        int n = X.nextInt();

        if(n % 2 == 0)
        {
            System.out.print(n + " is EVEN.");
        }
        else
        {
            System.out.print(n +" is ODD");
        }
    }
}