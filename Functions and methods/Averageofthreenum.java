import java.util.*;
public class Averageofthreenum
{
    public static void main(String args[])
    {
        Scanner xyz = new Scanner(System.in);

        System.out.print("Input the first number : ");
        double x = xyz.nextDouble();

        System.out.print("Input the second number : ");
        double y = xyz.nextDouble();

        System.out.print("Input the third number : ");
        double z = xyz.nextDouble();

        System.out.print("The average is 😁😂🤣😊 : "+average(x,y,z)+"\n");
    }
    public static double average(double x, double y, double z)
    {
        return (x+y+z)/3;
    }
}