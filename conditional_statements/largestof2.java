import java.util.*;
public class largestof2{
    public static void main(String args[]){
        Scanner xyz = new Scanner(System.in);

        System.out.print("Eneter a : ");
        int A = xyz.nextInt();

        System.out.print("Enter b : ");
        int B = xyz.nextInt();

        if(A==B)
        {
            System.out.print("A & B are same");
        }
      else  if(A>B){
            System.out.print("A is larger than B");
        }
        else
        {
            System.out.print("B is larger than A");

        }

    }
} 